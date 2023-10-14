package com.cxey.javastudy;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab{

    public static final CreativeModeTab C_MODE_TAB = new CreativeModeTab(Main.MOD_ID) {
        @Override
        public ItemStack makeIcon(){
            return new ItemStack(Citemreg.Citem.get());
        }

    };

    
    
}
