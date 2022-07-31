package lecture_programs;

class Shape1 {

    void a() {
        System.out.println("Its a() of Shape...");
    }
    void b(){
        System.out.println("Its b() of Shape...");
    }
}
class Circle1 extends Shape1
{
    void c(){
        
    }
    void d(){
        
    }
    void e(){
        
    }
    void a(){
        System.out.println("Its a() of Circle...");
    }
}
class Triangle extends Shape1
{
    void a()
    {
        
    }
}
class DynamicMethodDispatchDemo
{
    public static void main(String[] args)
    {
        Shape1 s1 = null;
        //
        //
       //
       
        
        s1 = new Shape1();
        //s1.a();
       // s1.b();
       // Circle1 c1 = new Circle1();
       // c1.a();
      //  c1.b();
       // c1.c();
      //  c1.d();
      //  c1.e();
        s1 = new Circle1();  // Valid  - DYNAMIC METHOD DISPATCH
      ///
      //
        //Circle1 c2 = new Shape1();  //Invalid
        s1  = new Triangle();
        s1.a();
        
        s1 = null;
        
        
        
    }
}
