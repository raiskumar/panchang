package ai.siddha.panchang.dto.rasi;

import ai.siddha.panchang.dto.Position;

/**
 * The zodiac (sky) lasts 360° and it is divided into 12 equal parts. They are called “rasis” (signs).
 */
public class Rasi {
    private String name;   // Sanskrit name
    private String englishName;
    private String symbol;
    private Position start;
    private Position end;
}
