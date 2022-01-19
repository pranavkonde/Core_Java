import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner x=new Scanner(System.in);
		int a = x.nextInt();
		int rev=0,i;
		while(a>0)
		{
			i=a%10;
			rev=rev*10+i;
			a=a/10;		
		}
		System.out.println("Reverse is: "+rev);
		x.close();
	}
}
