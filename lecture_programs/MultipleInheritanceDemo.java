package lecture_programs;

interface A
{
    void f1();
    void f2();
}


class B implements A
{
    void f3(){System.out.println("B--f3");}
    public void f1(){System.out.println("B-f1");}
    public void f2(){System.out.println("B -f2");}
}
interface C extends A{
    void f4();
    void f5();
}
class D extends B implements C
{
    void f6(){}
    public void f4(){System.out.println("D--f4");}     
    public void f5(){System.out.println("D--f5");}
  // public void f1(){System.out.println("D-f1");}
  // public void f2(){System.out.println("D -f2");}
    
}

class MultipleInheritanceDemo
{
    public static void main(String a[])
    {
        D d1 = new D();
        d1.f1();
        d1.f2();
        d1.f3();
        d1.f4();
        d1.f5();
        d1.f6();
    }
}