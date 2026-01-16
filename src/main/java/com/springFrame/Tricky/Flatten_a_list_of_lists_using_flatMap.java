import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten_a_list_of_lists_using_flatMap {
    public static void main(String[] args) {

        List<List<String>> listofLists = Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("c","d"),
                Arrays.asList("e","f")
        );

        List<String> flatlist = listofLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatlist);
    }
}
