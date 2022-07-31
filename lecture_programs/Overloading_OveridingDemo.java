package lecture_programs;

class Person
{
    int age;
    String name;
    
    void setData()
    {
        age=30;
        name="Umang";
    }
    void setData(int a, String s)
    {
        age=a;
        name =s;
    }
    void show()
    {
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
    }
    
}
class EnggStudent extends Person
{
    int roll;
    void setData()
    {
        age=20;
        name="Krish";
        roll=31;
    }
    void show()
    {
        System.out.println("Age = " + age);
        System.out.println("Name = " + name);
        System.out.println("Roll no. = "+roll);
    }
}

class Overloading_OveridingDemo
{
    public static void main(String s[])
    {
        Person p1 = new Person();
        p1.setData();
        Person p2 = new Person();
        p2.setData(25,"Brajesh" );
        p1.show();
        p2.show();
        
        EnggStudent e1 = new EnggStudent();
        e1.setData();
        e1.show();
        
    }
}