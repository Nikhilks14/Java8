import java.util.Arrays;
import java.util.List;

// 18.Use peek() for stream debugging

public class peek_for_stream_debugging {
    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape");

        List<String> result = fruits.stream()
                .peek(fruit -> System.out.println("Original: " + fruit))
                .map(String::toUpperCase)
                .peek(fruit -> System.out.println("Uppercase: " + fruit))
                .toList();

        System.out.println("Final list: " + result);

    }
}
