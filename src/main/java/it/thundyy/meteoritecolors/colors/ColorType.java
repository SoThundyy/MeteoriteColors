package it.thundyy.meteoritecolors.colors;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.bukkit.Color;

import java.awt.*;

@RequiredArgsConstructor
@Getter
public enum ColorType {
    // colors

    RED("red"),
    GREEN("green"),
    BLUE("blue"),
    YELLOW("yellow"),
    WHITE("white"),
    BLACK("black"),
    ORANGE("orange"),
    PURPLE("purple"),
    PINK("pink"),
    BROWN("brown"),
    CYAN("cyan"),
    GRAY("gray"),
    LIGHT_GRAY("light_gray"),
    LIME("lime"),
    MAGENTA("magenta"),
    LIGHT_BLUE("light_blue"),
    ;

    private final String colorName;
}
