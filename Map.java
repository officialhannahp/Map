import java.util.HashMap;
import java.util.Set;

public class Map {
    public void trackList() {
        HashMap<String, String> list = new HashMap<String, String>();
        list.put("Slow Dancing in the Dark", "Joji");
        list.put("Rush Over Me", "Seven Lions");
        list.put("Lowkey", "Niki");
        list.put("History", "Rich Brian");

        String name = list.get("Lowkey");
        System.out.println(name);


        Set<String> keys = list.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(list.get(key));
        }
    }
}