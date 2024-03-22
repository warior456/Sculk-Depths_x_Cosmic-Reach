package ugi.sculk_depths.blocks;

import com.github.repletsin5.lunar.api.blocks.BlocksRegistry;
import com.github.repletsin5.lunar.api.blocks.ModBlock;
import ugi.sculk_depths.SculkDepths;

public class ModBlocks {

    public static void registerBlocks(){
        BlocksRegistry.register(SculkDepths.MOD_ID,"Umbrusk",new ModBlock());
        //BlocksRegistry.register(SculkDepths.MOD_ID,"Umbrusk",new ModBlock());
    }
}
