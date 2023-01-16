package it.thundyy.meteoritecolors;

import com.meteoritepvp.api.MeteoritePlugin;
import it.thundyy.meteoritecolors.colors.registry.ColorRegistry;
import it.thundyy.meteoritecolors.commands.ColorCommand;
import it.thundyy.meteoritecolors.inventories.InventoryProvider;
import lombok.Getter;

@Getter
public final class ColorPlugin extends MeteoritePlugin {

    private ColorRegistry colorRegistry;
    private InventoryProvider inventoryProvider;

    @Override
    protected void onInit() {
        registerCommandObjects(new ColorCommand(this));
    }

    @Override
    public void onEnable() {
        colorRegistry = new ColorRegistry();
        inventoryProvider = new InventoryProvider(this);

        registerPlaceholderParameter("colors", sender -> colorRegistry.getColors());
    }

}
