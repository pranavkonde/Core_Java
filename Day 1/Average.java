import java.util.*;
public class Average {
	public static void main(String[] args) {
		{
			int a,b,c,d,e,average;
			Scanner x=new Scanner(System.in);
			System.out.println("Enter marks of five subjects: ");
			a=x.nextInt();
			b=x.nextInt();
			c=x.nextInt();
			d=x.nextInt();
			e=x.nextInt();
			average=(a+b+c+d+e)/5;
			System.out.println("\n Average of five Marks is: " +average);	
		}
	}
}
