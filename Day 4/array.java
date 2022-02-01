import java.util.*;
public class array {

	public static void main(String[] args) {
		System.out.println("Enter the size of array: ");
		Scanner x=new Scanner(System.in);
		int j=x.nextInt();
		int a[]=new int[j];
		for(int i=0;i<j;i++)
		{
			System.out.println("Enter the Number");
			a[i]=x.nextInt();
		}
		for(int i=0;i<j;i++)
		{
			System.out.println(a[i]);
		}
		x.close();
	}
}
