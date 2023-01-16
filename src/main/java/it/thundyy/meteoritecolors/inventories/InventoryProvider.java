package it.thundyy.meteoritecolors.inventories;

import com.google.common.collect.Maps;
import com.meteoritepvp.api.inventory.MeteoriteInventory;
import com.meteoritepvp.api.inventory.presets.BasicInventory;
import com.meteoritepvp.api.inventory.presets.CustomInventory;
import it.thundyy.meteoritecolors.ColorPlugin;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.inventory.InventoryHolder;

import java.util.Map;

@RequiredArgsConstructor
public class InventoryProvider {
    private final ColorPlugin plugin;
    @Getter
    private MeteoriteInventory inventory;

    public void init() {
        inventory = new MeteoriteInventory(plugin, "Colors", 6, 9, false);
        inventory.applyPage(new ColorInventory(plugin));
    }
}
