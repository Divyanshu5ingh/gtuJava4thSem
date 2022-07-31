package lecture_programs;

import java.util.Scanner;

class StudentDemo
{
    int age;
    String name;
    //Default Constructor
    StudentDemo()
    {
        age=10;
        name="Shreyas";
    }
    //Parametrized Constructor
    StudentDemo(int a, String s)
    {
        age=a;
        name=s;
    }
    StudentDemo(String a, int s)
    {
        age=s;
        name=a;
    }
    StudentDemo(String n)
    {
        age=20;
        name=n;
    }

    void show()
    {
        System.out.println("The value of age is = " + age);
        System.out.println("The value of name is = " + name);
    }
}
class ConstructorDemoProgram
{
    public static void main(String args[])
    {
        StudentDemo s1 = new StudentDemo(); // calls the defualt constructor of Java
        s1.show();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name :");
        String s = sc.next();
        System.out.println("Enter the age :");
        int p = sc.nextInt();
        StudentDemo s2 = new StudentDemo(s,p);// PC
        s2.show();
        StudentDemo s3 = new StudentDemo("Bhavisha");
        s3.show();
    }
}