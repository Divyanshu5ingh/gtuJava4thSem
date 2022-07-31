package lecture_programs;

/* Program to demonstrate Parameterized Constructor */

class Circle
{
    int radius;
    int a,b;
    //Default Constructor
    Circle()
    {
        radius = 10;
     
    }
  
    //Parameterized Constructors - 1
    Circle(int radius,int p,int q)
    {
        //radius = r;
        this.radius = radius;
        a=p;
        b=q;
    }
    //Parameterized Constructors - 2
    Circle(int r, int s)
    {
        radius = r;
        a=s;
        b=100;
    }
    //Copy Constructor
    Circle(Circle c1)
    {
        radius=c1.radius;
        a=c1.a;
        b=c1.b;
    }
    double area()
    {
        return 3.14 * radius * radius;
    }
}
class ConstructorDemo
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle();  // DC
      
        System.out.println("Area of c1 is : "+ c1.area());
        Circle c2 = new Circle(20,11,12); //PC-1
        System.out.println("Area of c2 is : "+ c2.area());
        Circle c3 = new Circle(c1); // Copy Constructor
        System.out.println("Area of c3 is : "+ c3.area());
        Circle c4 = c2; // ALias of c2
        System.out.println("Area of c4 is : "+ c2.area());
    }
}