package com.github.tiefkuhlfach.core.init;

import net.minecraft.item.*;

import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import com.github.tiefkuhlfach.TiefesFood;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit  {
public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TiefesFood.MOD_ID);

    public static final RegistryObject<Item> JAM = ITEMS.register("jam",
            () -> new Item(new Item.Properties().tab(TiefesFood.TIEFESFOODGROUP).stacksTo(16)));
    public static final RegistryObject<Item> JAM_BREAD = ITEMS.register("jam_bread",
            () -> new Item(new Item.Properties().tab(TiefesFood.TIEFESFOODGROUP).food(new Food.Builder().nutrition(6).saturationMod(1.5f).build())));
    public static final RegistryObject<Item> STRAWBERRY_JAM_BREAD_WITH_HONEY = ITEMS.register("strawberry_jam_bread_with_honey",
            () -> new Item(new Item.Properties().tab(TiefesFood.TIEFESFOODGROUP).food(new Food.Builder().nutrition(6).saturationMod(1.5f).fast().build())));

    public static final RegistryObject<Item> PICKLE = ITEMS.register("pickle",
            () -> new Item(new Item.Properties().tab(TiefesFood.TIEFESFOODGROUP).food(new Food.Builder().nutrition(6).saturationMod(1.5f).build())));
    public static final RegistryObject<Item> CHORUS_PICKLE = ITEMS.register("chorus_pickle",
            () -> new Item(new Item.Properties().tab(TiefesFood.TIEFESFOODGROUP).food(new Food.Builder().nutrition(6).saturationMod(1.5f).effect(
                    ()-> new EffectInstance(Effects.LEVITATION,100,2),1f).build())));
    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().tab(TiefesFood.TIEFESFOODGROUP)));

    public static final RegistryObject<Item> DONUT = ITEMS.register("donut",
            () -> new Item(new Item.Properties().tab(TiefesFood.TIEFESFOODGROUP).food(new Food.Builder().nutrition(3).saturationMod(1f).build())));
    public static final RegistryObject<Item> CEREALS = ITEMS.register("cereals",
            () -> new SoupItem(new Item.Properties().tab(TiefesFood.TIEFESFOODGROUP).stacksTo(16).food(new Food.Builder().nutrition(4).saturationMod(1.3f).build())));
    public static final RegistryObject<Item> CHICKEN_NUGGET = ITEMS.register("chicken_nugget",
            () -> new Item(new Item.Properties().tab(TiefesFood.TIEFESFOODGROUP).food(new Food.Builder().nutrition(3).saturationMod(1.5f).meat().build())));

    public static final RegistryObject<Item> MILK_BOTTLE = ITEMS.register("milk_bottle",
            () -> new PotionItem(new Item.Properties().tab(TiefesFood.TIEFESFOODGROUP).stacksTo(1)));


}
