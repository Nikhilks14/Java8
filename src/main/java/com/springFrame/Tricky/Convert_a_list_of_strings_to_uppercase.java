import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_a_list_of_strings_to_uppercase {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("a", "B", "c", "greeN");
        input.replaceAll(String::toUpperCase);
        // input.forEach(System.out::println);

        List<String> input2 = Arrays.asList("a", "B", "c", "greeN");
        List<String> uppercaseList = input2.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        uppercaseList.forEach(System.out::println);
    }
}
