package ai.siddha.panchang.dto.rasi;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Details of all Rasis
 */
@AllArgsConstructor
@ToString
public class Rasis {
    private List<Rasi> rasis;

    public Rasis(){
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("rasis.yaml");
        Map<String, Object> obj = new Yaml().load(inputStream);
        List<Map<String, String>> r = (List<Map<String, String>>) obj.get("rasis");
        this.rasis = r.stream().map(Rasi::from).collect(Collectors.toList());
    }
}
