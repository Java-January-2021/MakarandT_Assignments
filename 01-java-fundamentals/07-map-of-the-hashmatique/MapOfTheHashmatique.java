import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique {

    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Tired To Death", "sample lyrics1");
        trackList.put("Questo Mostrarsi", "sample lyrics2");
        trackList.put("Abiata", "sample lyrics3");
        trackList.put("From the Fog", "sample lyrics4");
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
        System.out.println("containsKey=" + trackList.containsKey("Abiata"));
        System.out.println("Pull out one of the songs by its track title=" + "containsKey=" + trackList.get("Abiata"));
        for (String key : keys) {
            System.out.print(key);
            System.out.println(":" + trackList.get(key));
        }
    }
}
