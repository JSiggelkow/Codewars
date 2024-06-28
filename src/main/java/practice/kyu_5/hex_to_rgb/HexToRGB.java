package practice.kyu_5.hex_to_rgb;

import java.util.HashMap;

public class HexToRGB {
    public static HashMap<String, Integer> hexStringToRGB(String hex) {

        HashMap<String, Integer> resultMap = new HashMap<>();
        resultMap.put("r", Integer.parseInt(hex.substring(1,3),16));
        resultMap.put("g", Integer.parseInt(hex.substring(3,5),16));
        resultMap.put("b", Integer.parseInt(hex.substring(5),16));

        return resultMap;
    }
}
