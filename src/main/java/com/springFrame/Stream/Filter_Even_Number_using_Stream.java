// 1.Filter even numbers from a list using streams


package com.springFrame.Stream;



import java.util.List;
import java.util.stream.Collectors;

public class Filter_Even_Number_using_Stream {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> evenList = list.stream()
                .filter( n -> n % 2 == 0)
                .collect(Collectors.toList());

        // evenList.forEach(System.out::println);

        evenList.forEach(item -> System.out.println("value : " + item));


    }
}
