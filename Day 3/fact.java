import java.util.*;
public class fact {

	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner x=new Scanner(System.in);
		int a,b,c,fact = 1;
		a=x.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);
		x.close();
	}

}
