public class Prac2
{
	public static void main(String[] args)
	{
		System.out.print("Given System of equations: ");
		System.out.print("1)3.4x+50.2y=44.5 \n2)2.1x+0.55y=5.9");
		double a=3.4,b=50.2,c=2.1,d=0.55,e=44.5,f=5.9,x,y;
		x=(e*d-b*f)/(a*d-b*c);
		y=(a*f-e*c)/(a*d-b*c);
		System.out.print("Solution of this system is:\nX= " + x +"\nY= " + y);
	}
}
