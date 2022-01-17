import java.util.*;
public class Calc {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		a=x.nextInt();
		System.out.println("Enter the Second number: ");
		b=x.nextInt();
		System.out.println("\n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n");
		c=x.nextInt();
		switch(c)
		{
		case 1:
			d=a+b;
			System.out.println("Addition is: "+d);
			break;
		case 2:
			d=a-b;
			System.out.println("Subtraction is: "+d);
			break;
		case 3:
			d=a/b;
			System.out.println("Division is: "+d);
			break;
		case 4:
			d=a*b;
			System.out.println("Multiplication is: "+d);
			break;	
		}
		x.close();
	}
}
