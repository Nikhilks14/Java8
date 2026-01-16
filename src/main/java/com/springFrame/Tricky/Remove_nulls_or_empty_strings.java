import java.util.Arrays;
import java.util.List;

// 17.Remove nulls or empty strings

public class Remove_nulls_or_empty_strings {
    public static void main(String[] args) {

        List<String> items = Arrays.asList("apple", "", null, "banana", " ", "cherry", null);

        List<String> filltered = items.stream()
                .filter( s -> s != null && !s.trim().isEmpty() )
                .toList();

        System.out.println(filltered);
    }
}
