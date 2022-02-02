import java.util.Scanner;

public class methodwithoutargret {
	static void sum()
	{
		int a,b,c;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter a and b");
		a=x.nextInt();
		b=x.nextInt();
		c=a+b;
		System.out.println("Sum is: "+c);
	}
	public static void main(String[] args)
	{
		sum();
	}
}
