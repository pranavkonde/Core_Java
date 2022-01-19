import java.util.Scanner;
public class SDigit {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner x=new Scanner(System.in);
		int a = x.nextInt();
		int sum=0,i;
		while(a>0)
		{
			i=a%10;
			sum=sum+i;
			a=a/10;		
		}
		System.out.println("Sum is: "+sum);
		x.close();
	}
}
