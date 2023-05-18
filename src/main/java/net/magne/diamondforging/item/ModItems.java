package net.magne.diamondforging.item;

import net.magne.diamondforging.DiamondForging;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DiamondForging.MOD_ID);

    public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIAMONDFORGING_TAB)));
    public static final RegistryObject<Item> DIAMOND_ROD = ITEMS.register("diamond_rod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIAMONDFORGING_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
