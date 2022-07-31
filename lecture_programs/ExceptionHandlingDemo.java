package lecture_programs;

class ExceptionHandlingDemo
{
    public static void main(String[] args)
    {   
       
        int[] a = new int[5];
       try {
        int j=5/0;
        a[1]=25;
       
       }
     
       catch(Exception e)
       {
            System.out.println("General Exception block" + e); 
       }
       finally
       {
           System.out.println("This line will ALWAYS execute");
       }
        System.out.println("Its a normal exit");
    }
}