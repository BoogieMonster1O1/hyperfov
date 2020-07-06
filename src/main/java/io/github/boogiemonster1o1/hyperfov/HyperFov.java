package io.github.boogiemonster1o1.hyperfov;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;

public class HyperFov implements ModInitializer {
    @Override
    public void onInitialize() {
        LogManager.getLogger(HyperFov.class).info("Initializing HyperFov");
    }
}
