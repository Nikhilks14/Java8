import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 16.Find duplicates in a list using streams

public class Duplicate_in_list {
    public static void main(String[] args) {

        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");

        List<String> duplicates = items.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue()> 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Duplicates : " + duplicates);
    }
}
