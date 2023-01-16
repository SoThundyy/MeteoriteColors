package it.thundyy.meteoritecolors.commands;

import com.meteoritepvp.api.command.Command;
import com.meteoritepvp.api.command.CommandClass;
import it.thundyy.meteoritecolors.ColorPlugin;
import lombok.RequiredArgsConstructor;
import org.bukkit.entity.Player;

@Command(name = "color", description = "Color command", aliases = {"c"})
@RequiredArgsConstructor
public class ColorCommand implements CommandClass {
    private final ColorPlugin plugin;

    @Command(args = "add", params = "@colors", description = "Add color")
    public void addColor(Player player, String colorName) {
        if (!plugin.getColorRegistry().isColorValid(colorName)) {
            player.sendMessage("§cColor not found!");
            return;
        }

        plugin.getColorRegistry().addColor(colorName);
        player.sendMessage("§aAdded color " + colorName);
    }

    @Command(args = "remove", params = "@colors", description = "Remove color")
    public void removeColor(Player player, String colorName) {
        if (!plugin.getColorRegistry().contains(colorName)) {
            player.sendMessage("§cColor not found!");
            return;
        }

        plugin.getColorRegistry().removeColor(colorName);
        player.sendMessage("§aRemoved color " + colorName);
    }

    @Command(description = "Open color inventory")
    public void openInventory(Player player) {
        if (player == null) return;

        plugin.getInventoryProvider().getInventory().show(player);
    }
}
