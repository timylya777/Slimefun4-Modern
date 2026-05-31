package io.github.thebusybiscuit.slimefun4.fabric;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlimefunFabric implements ModInitializer {
    public static final String MOD_ID = "slimefun";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Slimefun4 on Fabric!");
        
        // In the future, we will register our platform provider and load items here:
        // SFPlatform.setProvider(new FabricPlatformProvider());
    }
}
