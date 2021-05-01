package ai.siddha.panchang.dto.rasi;

import ai.siddha.panchang.dto.Position;
import lombok.*;

import java.util.Map;

/**
 * The zodiac (sky) lasts 360° and it is divided into 12 equal parts. They are called “rasis” (signs).
 */
@Builder
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Setter
public class Rasi {
    private String name;   // Sanskrit name
    private String aka;
    private String englishName;
    private String symbol;
    private Position start;
    private Position end;

    public static Rasi from(Map<String, String> map){
        return Rasi.builder()
                .name(map.get("name"))
                .aka(map.get("aka"))
                .englishName(map.get("englishName"))
                .symbol(map.get("symbol"))
                .start(new Position(map.get("start")))
                .end(new Position((map.get("end"))))
                .build();
    }
}
