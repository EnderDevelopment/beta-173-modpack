package com.example.beta173;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Beta173Mod implements ModInitializer {
    public static final String MOD_ID = "beta173";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Beta 1.7.3 Mod");
        // Initialize mod components here
    }
}