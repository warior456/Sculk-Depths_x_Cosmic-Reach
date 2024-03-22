package ugi.sculk_depths;

import net.fabricmc.api.ModInitializer;
import ugi.sculk_depths.blocks.ModBlocks;


import java.util.logging.Logger;

public class SculkDepths implements ModInitializer {
    public static final String MOD_ID = "sculk_depths";
    public static final Logger LOGGER = Logger.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello non Cosmic world!");

        //GameAssetLoader.loadAsset("/assets/blocks/umbrusk.json");
        //loadBlockFromJsonByID(MOD_ID, "block_umbrusk");
        //GameAssetLoader.loadAsset("blocks/" + "umbrusk" + ".json");
        ModBlocks.registerBlocks();
    }


}
