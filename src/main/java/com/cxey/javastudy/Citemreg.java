package com.cxey.javastudy;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.RegistryObject;



public class Citemreg {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);
    public static final RegistryObject<Item> Citem = ITEMS.register("citem", Citem::new);
    public static final RegistryObject<Item> Brshield = ITEMS.register("brshield", Shield::new);


}
