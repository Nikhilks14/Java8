package com.springFrame.Stream;

// 4.Remove duplicates from a list
// Uses the distinct() method from Stream API to remove duplicates.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_duplicates_from_a_list {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("A","B", "A", "C");
        List<Integer> input2  = Arrays.asList(1,2,3,4,1,2,3,5,6,8,6,41,8);

        List<String> distint = input.stream().distinct().collect(Collectors.toList());
        List<Integer> distint2 = input2.stream().distinct().collect(Collectors.toList());

        // distint.forEach(System.out::println);
        System.out.println(distint2);
        distint2.forEach(System.out::println);
    }
}
