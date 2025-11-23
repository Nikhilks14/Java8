package com.springFrame.Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Count_word_frequency_in_a_given_string {
    public static void main(String[] args) {
        String text = "this is a this is a test";

        Map<String , Long> frequency = Arrays.stream(text.split("\\s+"))
                .collect(Collectors.groupingBy(w -> w , Collectors.counting()));

        frequency.forEach((word, count) ->
                System.out.println(word + " = " + count));
    }
}
