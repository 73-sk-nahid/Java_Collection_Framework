
import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Bangladesh", "Dhaka");
        map.put("India", "New Delhi");
        
        //check if the value previously added or not
        map.putIfAbsent("India", "New Delhi");
        map.putIfAbsent("Malaysia", "Kua La Lampur");

        
        System.out.println(map);

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for(String key : map.keySet()){
            System.out.println(key);
        }

        for(String value : map.values()){
            System.out.println(value);
        }

        System.out.println(map.containsKey("Bangladesh"));
        System.out.println(map.containsValue("Dhaka"));
        System.out.println(map.containsKey("China"));

    }
}
