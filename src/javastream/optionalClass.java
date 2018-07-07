/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastream;

import java.util.Optional;

/**
 *
 * @author Rupali Goyal
 */

//It can help in writing neat code without using too many null checks. By using Optional,
//we can specify alternate values to return or alternate code to run. This makes the code more
//readable because the facts which were hidden are now visible to the developer.
public class optionalClass
{
    public static void main(String[] args)
    {
        
        String[] words = new String[10];  
        Optional<String> checkNull = 
                      Optional.ofNullable(words[5]);  
        if (checkNull.isPresent()) 
        {  
            String word = words[5].toLowerCase();  
            System.out.print(word);  
        } 
        else 
        {
            System.out.println("word is null");  
        }  
        
        
        
        //----------------------------------------------------------------------------------------
 
        // creating a string array
        String[] str = new String[5];
 
        // Setting value for 2nd index
        str[2] = "Geeks Classes are coming soon";
 
        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
 
        // It returns value of an Optional.
        // If value is not present, it throws
        // an NoSuchElementException
        System.out.println(value.get());
 
        // It returns hashCode of the value
        System.out.println(value.hashCode());
 
        // It returns true if value is present,
        // otherwise false
        System.out.println(value.isPresent());
    }
}
