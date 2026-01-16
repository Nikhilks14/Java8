import java.util.Arrays;
import java.util.List;

public class Sum_all_numbers_in_a_list_using_reduce {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int num = number.stream()
                .reduce(0, (a,b) -> a+b );

        System.out.println(num);
    }
}
