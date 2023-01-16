package it.thundyy.meteoritecolors.inventories;

import com.meteoritepvp.api.inventory.presets.BasicInventory;
import it.thundyy.meteoritecolors.ColorPlugin;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.concurrent.atomic.AtomicInteger;

public class ColorInventory extends BasicInventory {
    private final ColorPlugin plugin;

    public ColorInventory(ColorPlugin plugin) {
        this.plugin = plugin;

        setOnSlotClickListener(event -> event.getEvent().setCancelled(true));
    }

    @Override
    public void init() {
        AtomicInteger slot = new AtomicInteger();

        plugin.getColorRegistry().forEachColor(color -> {
            setItem(slot.getAndIncrement(), new ItemStack(Material.WOOL, 1, color.getWoolData()));
        });

    }
}
