package com.13neli21mso.oceanwavesmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OceanWavesMod implements ModInitializer {
    public static final String MOD_ID = "oceanwavesmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Ocean Waves Mod");
        // Initialize mod components here
        OceanWaves.initialize();
        BoatInteraction.initialize();
        MultiplayerSupport.initialize();
    }

    public void onEnable() {
        LOGGER.info("Enabling Ocean Waves Mod");
        // Enable mod components here
    }

    public void onDisable() {
        LOGGER.info("Disabling Ocean Waves Mod");
        // Disable mod components here
    }

    public void onStop() {
        LOGGER.info("Stopping Ocean Waves Mod");
        // Stop mod components here
    }
}