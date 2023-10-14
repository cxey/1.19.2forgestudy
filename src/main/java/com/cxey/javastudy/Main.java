package com.cxey.javastudy;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MOD_ID)
public class Main {
    public static final String MOD_ID = "javastudy";
    
    public Main(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        Citemreg.ITEMS.register(modEventBus);
        
    }
}
