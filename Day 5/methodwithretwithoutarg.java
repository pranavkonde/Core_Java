import java.util.*;
public class methodwithretwithoutarg {
	static void sum(int c,int d)
	{
		int z;
		z=c+d;
		System.out.println("Sum is: "+z);
	}
	public static void main(String[] args) {
		int a,b;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter value of a and b: ");
		a=x.nextInt();
		b=x.nextInt();
		sum(a,b);
	}
}
