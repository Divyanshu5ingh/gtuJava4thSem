// Demonstration of class and objects
package lecture_programs;

class Calculator
{
    int num1,num2,result;
    Calculator()
    {
        num1 = 15;
        num2 = 25;
    }
    void setters(int n1,int n2)
    {
        num1 = n1;
        num2 = n2;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
   
    public int getResult() {
        return result;
    }
    void addition()
    {
        result = num1 + num2;
    }
}
class ClassObjectDemo
{
    public static void main(String[] args)
    {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();
        //c1.setNum1(5);
        //c1.setNum2(10);
        c1.setters(5, 10);
        c1.addition();
        System.out.println("Addition is for c1: " + c1.getResult());
        //c2.setNum1(20);
       // c2.setNum2(30);
        //c2.setters(20,30);
        c2.addition();
       System.out.println("Addition is for c1: " + c2.getResult());
    }
}

