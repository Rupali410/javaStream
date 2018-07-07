/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastream;

import java.util.*;  
import java.util.stream.Collectors;
class Product
{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) 
    {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 

public class collector
{  
    public static void main(String[] args) 
    {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList =   
                productsList.stream()  
                            .map(x->x.price)         // fetching price  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList); 
        System.out.println("\n");
        
        
        List<String> letters = new ArrayList<>();
        letters.add("H");
        letters.add("e");
        letters.add("l");
        letters.add("l");
        letters.add("o");
        List<String> word = letters.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(word);
        System.out.println(" \n"); 


        Set<String> set = letters.stream()
                          .map(s -> s.toUpperCase())
                          .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set); 
        System.out.println(" \n"); 

// Convert elements to strings and concatenate them, separated by commas
        String joined = letters.stream()
                      .map(s -> s.toUpperCase())
                      .collect(Collectors.joining(", "));
        System.out.println(joined); 
        System.out.println(" \n"); 

// Compute sum of all letters
        int total = letters.stream()
                      .collect(Collectors.summingInt(s->s.length()));
        System.out.println(total);
        System.out.println("\n");

// Group by starting letter
        Map<String, List<String>> grouped = letters.stream()
                                    .collect(Collectors.groupingBy(s->s.substring(0,1)));
        System.out.println(grouped);

// Partition letters into uppercase and lowercase
        Map<Boolean, List<String>> upperLower = letters.stream()
                                    .collect(Collectors.partitioningBy(s -> Character.isUpperCase(s.codePointAt(0))));
        System.out.println(upperLower); 
    }  
}  

