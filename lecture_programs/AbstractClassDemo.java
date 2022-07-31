package lecture_programs;


abstract class Bank
{
       double rate;
      abstract void getRateOfInterest();
      void m1(){
      
      }
      Bank(){}
      Bank(double r)
      {
          rate = r;
      }
    
}
class PrivateBank extends Bank
{
    PrivateBank(double d)
    {
        super(d);
    }
    void getRateOfInterest()
    {
        
    }
    PrivateBank(){}
}
      
 

class AbstractClassDemo
{
    public static void main(String [] args)
    {
       PrivateBank b1 = new PrivateBank(7.5);
       PrivateBank b2 = new PrivateBank();
        //b1.getRateOfInterest();
    }

    
}