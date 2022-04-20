package com.github.tiefkuhlfach.core.event;

import com.github.tiefkuhlfach.TiefesFood;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeBook;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.item.ItemEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import javax.swing.text.html.parser.Entity;
import java.util.Collection;

@Mod.EventBusSubscriber(modid = TiefesFood.MOD_ID, bus = Bus.FORGE)
public class EventHandler {
}
