package lecture_programs;

import java.util.Arrays;
public class Unit3 {

	public static void main(String[] args) {
		

		//System.out.println(max(1,4));
		//System.out.println(max(2.3,1.1));
	
		//System.out.println(2508%7);
		
int[] list = new int[10];
int[] list2 = new int[10];
		
		for(int i =0; i<list.length; i++)
			list[i]=i;
		System.out.println("List 1");
		printArray(list);
		
		System.arraycopy(list,3,list2,0,5);
		swapFirstTwoEle(list2);
		System.out.println("List 2");
		printArray(list2);	
		
//		int pos = binarySearch(list,14);
//		if(pos>=0)
//			System.out.println("Value found at position "+ (pos+1));
//		else
//			System.out.println("Value not found. You can insert this value at position at "+(Math.abs(pos)+1));
		
		int[] list3 = new int[10];
		Arrays.fill(list3,1,5,4);
		for(int i =0; i<list3.length; i++)
			list3[i]=(int)(Math.random()*10);
//System.out.println("List 3: "+Arrays.toString(list3));
		printArray(list3);
				Arrays.sort(list3);
Arrays.sort(list3,1,3);
		System.out.println("List 3 after sort");
		printArray(list3);
//		
		int pos = Arrays.binarySearch(list3,8);
		if(pos>=0)
			System.out.println("Value found at position: "+(pos+1));
		else
			System.out.println("Value not found. you can insert that value at: "+ (Math.abs(pos)));
		
		
		//int[][] matrix = new int[4][5];
//		int[][] matrix = {
//				{1,2,3,4,5},
//				{1,2,3},
//				{1,2,3,4}
//		};
		int[][] matrix = new int[4][];
		matrix[0] = new int[4];
		matrix[1] = new int[3];
		matrix[2] = new int[2];
		matrix[3] = new int[1];
				
		for(int i =0; i<matrix.length; i++)
			for(int j=0;j<matrix[i].length;j++)
				matrix[i][j]=(int)(Math.random()*10);
		printArray(matrix);
		
		int total = 0;
		for(int i =0; i<matrix.length; i++)
			for(int j=0;j<matrix[i].length;j++)
				total+=matrix[i][j];
		
		System.out.println("Total is: "+total);
	}
	
	public static int binarySearch(int[] list, int key) {
		
		int upperbound=list.length-1;
		int lowerbound=0;
		int mid=0;
		
		while(lowerbound<=upperbound){
			mid=(upperbound+lowerbound)/2;
			if(key<list[mid]) {
				upperbound=mid-1;
			}
			else if (key==list[mid]) {
				return mid;
			}
			else {
				lowerbound=mid+1;
			}
		}	
		return -(mid+1);
	}
		
	public static void printArray(int[] list) {
		for(int i=0; i<list.length; i++)
			System.out.print(list[i]);
	}
	
	public static void printArray(int[][] matrix) {
		for(int i =0; i<matrix.length; i++){	
			for(int j=0;j<matrix[i].length;j++)
				System.out.print(matrix[i][j]+" ");
			//System.out.println();
		}
	}
	
	public static void swapFirstTwoEle(int[] list) {
		list[0]=list[0]+list[1];
		list[1]=list[0]-list[1];
		list[0]=list[0]-list[1];
	}
	
	public static void nPrintln(String msg,int n) {
		for(int i=0;i<n;i++)
			System.out.println(msg);
	}
	
	/** Return the max of two int values */
	public static int max(int num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	/** Find the max of two double values */
	public static double max(double num1, double num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
}