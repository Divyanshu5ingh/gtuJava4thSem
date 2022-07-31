package lecture_programs;
/*
Author : Pratiti
Date : 13-01-2021

Program Definition : Program to demonstrate basic String Functions
File Name: StringFunctionsDemoProgram.java
*/
import java.util.Scanner;

class StringFunctionsDemoProgram
{
    public static void main(String[] args)
    {
        String s1 = "Hello";
        String s2 = new String("World");
        String s3 = s1.concat(s2);
        //System.out.println("Length of the string is :" + s1.length());
        //System.out.println("Lowercase of the string is :" +s1.toLowerCase());
        //System.out.println("Uppercase of String is :" + s1.toUpperCase());
        //System.out.println("Trimming String is :" + s1.trim());
        //System.out.println("Comparing two strings :" + s1.compareTo(s3));
        System.out.println("Concatenation of strings is :" + s3);
        /*if(s1.equals(s2))
            System.out.println("Strings are equal");
        else    
            System.out.println("Strings are not same");
       */
    }
}