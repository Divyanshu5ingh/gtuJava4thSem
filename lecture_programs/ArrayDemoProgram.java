
class ArrayDemoProgram
{
    public static void main(String[] args)
    {
        int[] a = new int[5];
        System.out.println("Length of the array is :" + a.length);
        int[] b = {1,2,3,4,5};
        //Copying the array
        for(int i=0; i<b.length ;i++)
        {
            a[i] = b[i];
            System.out.println(a[i]);
        }
        
        int[][] a2 = new int[2][3]; //2 D Array
        
        //Ragged Array 
        int[][] raggedArray = new int[3][];
        raggedArray[0] = new int[5];
        
        
        
        
    
        //Taking values 
    }
}