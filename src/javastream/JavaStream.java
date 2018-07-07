/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 * @author Rupali Goyal
 */
public class JavaStream 
{
    public static void main(String[] args)
    { 
        //FILTER() METHOD--------------------------------
        //filter() method with operation of filtering out the elements divisible by 5.
         System.out.println("filter \n");
         List<Integer> list1 = Arrays.asList(3, 4, 6, 12, 20);
         list1.stream().filter(num -> num%5 == 0).forEach(System.out::println); //output =20;
         System.out.println("\n");
       
         // filter() method with operation of filtering out the elements with upperCase letter at index 1.
         List<String> list2 = Arrays.asList("GOs", "fOr","RUPALI", "gakks");
         list2.stream().filter(str -> Character.isUpperCase(str.charAt(1))).forEach(System.out::println);
         System.out.println("\n");
         
         //filter() method with operation of filtering out the elements ending with s.
         list2.stream().filter(str -> str.endsWith("s"))
            .forEach(System.out::println);
         System.out.println("\n");
         
         
         
         
         //FindFirst() METHOD-------------------------------------------------------------------------
         //(This method returns first element satisfying the intermediate operations.)
         System.out.println("findFirst ");
         Optional<Integer> answer = list1.stream().findFirst();
 
            if (answer.isPresent()) 
            {           // if the stream is empty, an empty Optional is returned.
                System.out.println(answer.get());
            }
            else
            {
                System.out.println("no value");
            }
            System.out.println("\n");
            
            
            
            
         //FindAny() METHOD--------------------------------------------------------------------------
         //(This method returns any first element satisfying the intermediate operations.)
         System.out.println("findAny ");
            List<Integer> list3 = Arrays.asList(9, 5, 2, 10, 13, 17);
            Optional<Integer> answer1 = list3.stream().findFirst();
 
            if (answer1.isPresent()) 
            {           // if the stream is empty, an empty Optional is returned.
                System.out.println(answer1.get());
            }
            else
            {
                System.out.println("no value");
            }
            System.out.println(" \n");
            
            
            IntStream stream = IntStream.of(6, 5, 12, 10, 13, 17).parallel();
            stream = stream.filter(i -> i % 4 == 0);
            OptionalInt answer2 = stream.findAny();
            
            if (answer2.isPresent()) 
            {
                System.out.println(answer2.getAsInt());
            }
            System.out.println("\n");
            
            //AnyMatch()----------------------------------------------------------------------------
            //returns whether any elements of this stream match the provided predicate.
            System.out.println("AnyMatch");
            
            boolean answer3 = list1.stream().anyMatch(n-> (n * (n + 1)) / 4 == 5);
            System.out.println(answer3);
            System.out.println("\n");
            
            
            
            //noneMatch()----------------------------------------------------------------------------
            //returns whether no elements of this stream match the provided predicate.
            System.out.println("noneMatch ");
            
            Stream<String> stream1 = Stream.of("CSE", "C++","Jav", "DS");
            boolean answer4 = stream1.noneMatch(str -> (str.length() == 4));
            System.out.println(answer4);
            System.out.println("\n");
            
            
            //anyMatch()------------------------------------------------------------------------------
            //returns whether all elements of this stream match the provided predicate. 
            System.out.println("AllMatch ");
            boolean answer5 = list2.stream().allMatch(str -> str.length() > 2);
            System.out.println(answer5);
            System.out.println("\n");
            
            
            //map()-----------------------------------------------------------------------------------
            //returns a stream consisting of the results of applying the given function to the elements of this stream.
            System.out.println("map ");
            List<String> answer6 = list2.stream().map(String::toUpperCase).
            collect(Collectors.toList());
            System.out.println(answer6);
            System.out.println("\n");
            
            
            //primitive version of map are
            //1.mapToInt
            //2.mapToDouble
            //3.mapToLong
            
             System.out.println("mapToInt ");
             List<String> list4 = Arrays.asList("3","5","12","4");
             list4.stream().mapToInt(num -> Integer.parseInt(num)).filter(num -> num % 3 == 0)
             .forEach(System.out::println);
             System.out.println("\n");
             
             System.out.println("mapToInt ");
             list2.stream().mapToInt(str -> str.length()).forEach(System.out::println);
             System.out.println("\n");
             
             System.out.println("mapToLong ");
             IntStream stream3 = IntStream.range(5, 10);
             LongStream stream4 = stream3.mapToLong(num -> (long)num - 20);
             stream4.forEach(System.out::println);
             System.out.println("\n");
             
             System.out.println("mapToDouble ");
             LongStream stream5 = LongStream.range(5L, 10L);
             DoubleStream stream6 = stream5.mapToDouble(Math::cos);
             stream6.forEach(System.out::println);
             
             System.out.println("\n");
             
             
            //peek()------------------------------------------------------------------------------------
            //This method exists mainly to support debugging, where you want to see the elements as they flow past 
            //a certain point in a pipeline. Using peek without any terminal operation does nothing.
            System.out.println("peek ");
            list1.stream().peek(System.out::println).count();
            System.out.println("\n");
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    }
    
}
