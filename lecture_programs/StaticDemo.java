package lecture_programs;

/*
Program to demonstrate
1. static variable
2. static method
3.static block
*/

class CircleDemo
{
    private int radius;
    static int numberOfObjects;
    static int m1 = method1();
    static int method1()
    {
        return 10;
    }
    CircleDemo()
    {
        System.out.println("Object created successfully with radius = 1");
        radius=1;
        numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
    CircleDemo(int radius)
    {
        System.out.println("Object created successfully with radius = " + radius);
        numberOfObjects++;
        this.radius=radius;
    }
    double areaOfCircle()
    {
        return 3.14 * radius * radius;
    }
    //Override the toString method   -- java.lang.Object
    public String toString()
    {
        return "Circle with radius " + this.getRadius()+"  has area = " + this.areaOfCircle();
    }

    public int getRadius() {
        return radius;
    }
    
}
class StaticDemo
{
  
   static
   {
       System.out.println("This is the first static block");
   }
   static
   {
       System.out.println("This is the second static block");
   }
   
   /*public static void main(String[] args)
    {
        System.out.println("Total no. of objects created are : " + CircleDemo.getNumberOfObjects());
        CircleDemo c1 = new CircleDemo();
        System.out.println("Total no. of objects created are : " + CircleDemo.getNumberOfObjects());
        CircleDemo c2 = new CircleDemo(10);
        System.out.println("Total no. of objects created are : " + CircleDemo.getNumberOfObjects());
        //double areaC1 = c1.areaOfCircle();
        
        System.out.println(c1);  //  c1.toString()
        
        System.out.println(c2);  //c2.toString();
        
        
    }*/
}