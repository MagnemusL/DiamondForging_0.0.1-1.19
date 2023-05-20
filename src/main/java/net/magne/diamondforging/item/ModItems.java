package net.magne.diamondforging.item;

import net.magne.diamondforging.DiamondForging;
import net.magne.diamondforging.item.custom.EightBallItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DiamondForging.MOD_ID);

    public static final RegistryObject<Item> DIAMOND_SHEET = ITEMS.register("diamond_sheet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIAMONDFORGING_TAB)));

    public static final RegistryObject<Item> DIAMOND_ROD = ITEMS.register("diamond_rod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIAMONDFORGING_TAB)));

    public static final RegistryObject<Item> GLOWING_DIAMOND_SHEET = ITEMS.register("glowing_diamond_sheet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIAMONDFORGING_TAB)));

    public static final RegistryObject<Item> GLOWING_DIAMOND_ROD = ITEMS.register("glowing_diamond_rod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIAMONDFORGING_TAB)));

    public static final RegistryObject<Item> DIAMOND_WIRE = ITEMS.register("diamond_wire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIAMONDFORGING_TAB)));

    public static final RegistryObject<Item> GLOWING_DIAMOND_WIRE = ITEMS.register("glowing_diamond_wire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIAMONDFORGING_TAB)));

    public static final RegistryObject<Item> DIAMOND_SPHERE = ITEMS.register("diamond_sphere",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIAMONDFORGING_TAB)));

    public static final RegistryObject<Item> GLOWING_DIAMOND_SPHERE = ITEMS.register("glowing_diamond_sphere",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIAMONDFORGING_TAB)));

    public static final RegistryObject<Item> GLOWING_DIAMOND = ITEMS.register("glowing_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.DIAMONDFORGING_TAB)));
    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.DIAMONDFORGING_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
