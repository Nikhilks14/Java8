import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class question {
    public static void main(String[] args) {

        List<Integer> al = Arrays.asList(1,1, 56, 239, 9, 0, 100, 234, 239, 678);

        // 1. Find the highest number or second or n-th highest number

//        int highest = al.stream().sorted(Comparator.reverseOrder()).findFirst().get();
//        System.out.println( " Highest number "+ highest);

//        int Second_highest = al.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
//        System.out.println( " Second Highest number " +   Second_highest);

        //   al.sort((e1 , e2) -> e1 - e2 );
        //  System.out.println(al);

        //  int n_highest = al.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
        //  System.out.println( " Second Highest number " +   n_highest);


        // 2. Top K highest Number int the list.
        //     al.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        // 3. Find the Max Number using reduce()
//        System.out.println(al.stream().reduce(Integer.MIN_VALUE, Integer::max));

        // Sum of all number
//        System.out.println(al.stream().reduce(0, Integer::sum)); // Using reduce
//        System.out.println(al.stream().mapToInt(Integer::intValue).sum());  // Recommended


//         4. Find the duplicate
//         Set<Integer> hs = new HashSet<>();
//         List<Integer> duplicate =  al.stream().filter( i -> !hs.add(i)).toList();
//         System.out.println(duplicate);

//        // 5. Partition even and odd in a list
//        Map<Boolean , List<Integer>> partitionList =
//                al.stream().collect(Collectors.partitioningBy(i -> i%2==0));
//
//        System.out.println( " even number list "+ partitionList.get(true));
//        System.out.println( " odd number list "+ partitionList.get(false));


//        6. Common element b/w two list
//        List<Integer> list1 = Arrays.asList(1,2,3,4,5,9,1);
//        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9);
//
//        List<Integer> commonElement =
//                list1.stream().filter(list2::contains).distinct().toList();
//        System.out.println(" Common in both the list : "+ commonElement);








//        String Operation ===================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        7.  find first non repeated character in a string

//        String str = "Javaprogram";
        String str = "madam";

//        System.out.println(str.chars().mapToObj(i->(char)i).
//                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
//        // {P=1, a=3, r=2, v=1, g=1, J=1, m=1, o=1}


//        System.out.println("First non repeated Character - " + str.chars().mapToObj(i->(char)i).
//                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
//                .entrySet().stream().filter(i -> i.getValue() == 1L)
//                .map(i -> i.getKey())
//                .findFirst().get());


//        8.  find first repeated character in a string

//        System.out.println("First repeated Character  - " + str.chars().mapToObj(i->(char)i).
//                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
//                .entrySet().stream().filter(i -> i.getValue() > 1L)
//                .map(i -> i.getKey())
//                .findFirst().get());


        // 9. reverse the String

//        String rev = IntStream.range(0,str.length()).mapToObj(i->str.charAt(str.length()-1-i))
//                .map(String::valueOf).collect(Collectors.joining());
//
//        System.out.println(rev);

//      10. Palindrome of a string

//        boolean isPalindrome = IntStream.range(0,str.length()/2)
//                .allMatch(i -> str.charAt(i) == str.charAt(str.length()-1-i));
//        System.out.println(isPalindrome);






// https://www.youtube.com/watch?v=1US2bWVvNm0
    }
}
