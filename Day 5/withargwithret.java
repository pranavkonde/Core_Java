import java.util.*;
public class withargwithret {
	static int sum(int c,int d)
	{
		int z=c+d;
		return z;
	}
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the value of a and b:");
		Scanner x=new Scanner(System.in);
		a=x.nextInt();
		b=x.nextInt();
		int c=sum(a,b);
		System.out.println("Sum is: "+c);
	}
}
