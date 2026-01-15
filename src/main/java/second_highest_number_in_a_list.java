import java.util.Arrays;
import java.util.List;

public class second_highest_number_in_a_list {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 3, 6, 5);
        Integer secondHighest = numbers.stream()
                .distinct()
                .sorted()
                .skip(numbers.size()-2)
                .findFirst()
                .orElse(null);

        System.out.println(secondHighest);

    }
}
