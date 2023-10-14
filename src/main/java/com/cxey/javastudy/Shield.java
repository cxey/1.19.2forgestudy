package com.cxey.javastudy;

import net.minecraft.world.item.ShieldItem;

public class Shield extends ShieldItem{

    
    public Shield(){
        super(new Properties().tab(CreativeTab.C_MODE_TAB).defaultDurability(1024));
    }

}
