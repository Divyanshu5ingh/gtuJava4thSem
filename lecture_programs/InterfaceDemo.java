package lecture_programs;

interface MyShape
{
    public void draw1();
    default public void f1()
    {
        System.out.println("Default version");
    }

}

class Square implements MyShape
{
    public void draw1() {}
    
    
}
class InterfaceDemo
{
    public static void main(String[] a)
    {
        MyShape s1=null;
        s1 = new Square();
        s1.draw1();
        s1.f1();
    }
}