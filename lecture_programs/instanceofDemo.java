package lecture_programs;

class Animal
{
    void m1()
    {
        
    }
}
class Cat extends Animal
{
    
}
class Bird
{
    
}
class instanceofDemo
{
    public static void main(String args[])
    {
        Animal a = new Animal();
        Animal a1=null;
        Cat c = new Cat();
        Bird b = new Bird();
        //System.out.println(c instanceof Animal);
        if(c instanceof Animal)
        {
            c.m1();
        }
       
    }
}   