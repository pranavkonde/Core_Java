import java.util.*;
public class prime {
	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner x=new Scanner(System.in);
		int r=0,i;
		int a=x.nextInt();
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				r++;
			}
		}
		if(r==2)
		{
			System.out.println("Number is a prime number");
		}
		else
		{
			System.out.println("Number is not a prime number");
		}
		x.close();
	}
}
