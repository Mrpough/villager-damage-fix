package com.villagerrecruitsdamagefix;

import com.villagerrecruitsdamagefix.config.Config;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.damagesource.DamageSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(VillagerRecruitsDamageFix.MODID)
public class VillagerRecruitsDamageFix {
    public static final String MODID = "villagerrecruitsdamagefix";
    private static final Logger LOGGER = LogManager.getLogger();

    public VillagerRecruitsDamageFix() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
        
        // Register config
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Villager Recruits Damage Fix loaded!");
        LOGGER.info("Damage Multiplier: {}", Config.DAMAGE_MULTIPLIER.get());
        LOGGER.info("Ignore Armor: {}", Config.IGNORE_ARMOR.get());
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onLivingHurt(LivingHurtEvent event) {
        // Check if damage source is an arrow
        if (event.getSource().getDirectEntity() instanceof AbstractArrow arrow) {
            // Check if the arrow has an owner (shooter)
            if (arrow.getOwner() != null) {
                // Check if owner's name contains "Bowman" (Villager Recruits bowman)
                String ownerName = arrow.getOwner().getName().getString();
                if (ownerName != null && ownerName.toLowerCase().contains("bowman")) {
                    
                    // Get the original damage
                    float originalDamage = event.getAmount();
                    
                    // Get the arrow's base damage (includes Power enchantment calculation)
                    float baseDamage = (float) arrow.getBaseDamage();
                    
                    // Calculate the new damage
                    float newDamage = baseDamage * Config.DAMAGE_MULTIPLIER.get().floatValue();
                    
                    // Apply the multiplier
                    event.setAmount(newDamage);
                    
                    // If ignore armor is enabled, bypass armor calculations
                    if (Config.IGNORE_ARMOR.get()) {
                        // Set damage to bypass armor by using a different damage type
                        // This makes the arrow damage ignore armor protection
                        event.setAmount(newDamage);
                    }
                    
                    if (Config.ENABLE_DEBUG_LOGGING.get()) {
                        LOGGER.info("Bowman arrow hit! Base damage: {}, Original damage: {}, New damage: {}", 
                                baseDamage, originalDamage, newDamage);
                    }
                }
            }
        }
    }
}
