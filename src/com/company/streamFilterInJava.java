package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Character.isUpperCase;

public class streamFilterInJava {

    public static void main(String[] args) {

        //Using filter in number list to find out by dividing 3, we get the remainder as 1

        List<Integer> filterList = Arrays.asList(4,7,9,13,15);

        filterList.stream().filter(num -> num % 3 == 1).forEach(System.out::println);

        Stream<String> filterListForAlphabeticalChars = Stream.of("Faris","fazil","Ikrama","fardin","Shaikh","Shah");

        streamFilterFunctionForAlphabets(filterListForAlphabeticalChars);


    }

    public static void streamFilterFunctionForAlphabets(Stream<String> a){

        a.filter(str -> Character.isUpperCase(str.charAt(0))).forEach(System.out::println);

    }

}
