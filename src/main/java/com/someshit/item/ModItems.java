package com.someshit.item;

import com.someshit.SomeShit;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PLACE = registerItem("place", new Item(settings("place")));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SomeShit.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SomeShit.LOGGER.info("Registering Mod Items for " + SomeShit.MOD_ID);
        SomeShit.LOGGER.warn("i wanna kms");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PLACE);
        });
    }

    private static Item.Settings settings(String name) {
        return new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(SomeShit.MOD_ID, name)));
    }
}
