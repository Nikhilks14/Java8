import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sort_a_Map_by_its_values {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("apple", 50);
        map.put("banana", 10);
        map.put("cherry", 40);
        map.put("date", 30);


        Map<String , Integer> sortedByValue = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println(sortedByValue);

    }
}
