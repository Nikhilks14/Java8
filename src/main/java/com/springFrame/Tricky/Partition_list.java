import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition_list {
    public static void main(String[] args) {
        
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Boolean, List<Integer>> partitioned = number.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        List<Integer> evenNumber = partitioned.get(true);
        List<Integer> oddNumber = partitioned.get(false);

        System.out.println(evenNumber);
        System.out.println(oddNumber);

    }
}
