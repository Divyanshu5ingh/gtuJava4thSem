package lecture_programs;


import java.util.Scanner;

/*

Write a java program to find out maximum and minimum munber out of two using function

*/

class MaxMinUsingFunction
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out .println("Enter number 1 : ");
        int a = sc.nextInt();
        System.out .println("Enter number 2 : ");
        int b = sc.nextInt();
        int max = maximum(a,b);
        System.out.println("The maximum out of two entered numbers is :"+max);
        //int min = minimum(a,b);
        System.out.println("The minimum out of two entered numbers is :"+ minimum(a,b));
    }
    public static int maximum(int p , int q)
    {
        if(p>q)
            return p;
        else 
            return q;
    }
    public static int minimum(int p , int q)
    {
        if(p<q)
            return p;
        else 
            return q;
    }
}