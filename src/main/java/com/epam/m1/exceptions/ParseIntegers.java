package com.epam.m1.exceptions;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS =
            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        String justWords = "";

        while (words.hasNext()) {
            String next = words.next();
            int s = 0;
            try {
                for (int i = 0; i < next.length(); i++) {
                    if (next.charAt(i) >= '0' && next.charAt(i) <= '9') s++;
                }
                if (s == next.length()) {
                    sum += Integer.parseInt("0" + next);
                } else justWords += " " + next;
            } catch (NumberFormatException e) {
                throw new IllegalStateException(e);
            }
            // todo: complete it
        }
        System.out.println("Sum is " + sum);
        System.out.println("Just words:" + justWords);
    }
}

