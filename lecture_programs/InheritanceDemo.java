package lecture_programs;

class Base
{
    private int a;
    protected String s;
    Base(String s)
            
    {
        a=100;
        this.s=s;
        System.out.println("This is default constructor of Base  " + a + " " + s);
    }
    void m1()
    {
        System.out.println("This is m1 of Base");
    }
    void showDataOfBase()
    {
        System.out.println("The value of a = " + a);
        System.out.println("The value of s = " + s);
        
    }
    void setA(int p)
    {
        a=p;
    }
}
class Derieved extends Base
{
    int j;
    char c;
    Derieved(int j,char c,String s)
    {
          super(s);
          this.j=j;
          this.c=c;
         
          System.out.println("This is 2 arg constructor of derived" + j + " " + c);
    }
    void m2()
    {
        System.out.println("This is m2 of Derieved");
    }
    void showDataOfDerieved()
    {
        System.out.println("The value of j = " + j);
        System.out.println("The value of c = " + c);
        
    }
}
/*class MyClass extends Derieved
{
    double d;
    MyClass()
    {
          System.out.println("This is default constructor of Myclass");
    }
     void m3()
    {
        System.out.println("This is m3 of MyClass");
    }
    
}*/

class InheritanceDemo
{
    public static void main(String[] a)
    {
        Derieved d = new Derieved(10,'A',"Hello");
       // Base b = new Base();
      //  d.m1();
       // d.m2();
       // d.c='A';
       // d.j=10;
      //  d.s="Hello";
       // d.setA(100);
      //  d.showDataOfBase();
      //  d.showDataOfDerieved();
        
        //MyClass m = new MyClass(1,2,3,4,5);
      //  m.s="Hi";
      //  m.showDataOfBase();
        
        
        
        
        
    }
}