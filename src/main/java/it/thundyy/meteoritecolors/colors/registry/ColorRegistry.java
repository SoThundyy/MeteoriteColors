package it.thundyy.meteoritecolors.colors.registry;

import com.google.common.collect.Maps;
import it.thundyy.meteoritecolors.colors.ColorType;
import org.bukkit.DyeColor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public final class ColorRegistry {
    private static final Map<String, DyeColor> colors = Maps.newHashMap();

    public void addColor(String colorName) {
        if (colors.containsKey(colorName)) return;

        for (DyeColor value : DyeColor.values()) {
            if (!value.name().equalsIgnoreCase(colorName)) continue;

            colors.put(colorName, value);
        }
    }

    public void removeColor(String colorName) {
        if (!colors.containsKey(colorName)) return;

        colors.remove(colorName);
    }

    public void forEachColor(Consumer<DyeColor> colorConsumer) {
        colors.values().forEach(colorConsumer);
    }

    public boolean contains(String colorName) {
        return colors.containsKey(colorName);
    }

    public boolean isColorValid(String colorName) {
        return getColors().contains(colorName);
    }

    public List<String> getColors() {
        List<String> colors = new ArrayList<>();

        for (ColorType value : ColorType.values()) {
            colors.add(value.getColorName());
        }

        return colors;
    }
}
