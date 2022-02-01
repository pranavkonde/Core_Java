import java.util.Scanner;
public class comb {
	public static void main(String[] args) {
		int a[]=new int[3];
		int b[]=new int[3];
		int c[]=new int[6];
		Scanner x= new Scanner(System.in);
		System.out.println("Enter elements for first array: ");
		for(int i=0;i<3;i++)
		{
				a[i]=x.nextInt();
		}
		System.out.println("Enter elements for second array: ");
		for(int i=0;i<3;i++)
		{
				b[i]=x.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			c[i]=a[i];
		}
		int n=3;
		while(n<6)
		{
		for(int i=0;i<3;i++)
		{
			c[n]=b[i];
		}
		n++;
		}
		System.out.println("Combine array will be: ");
		for(int i=0;i<6;i++)
		{	
			System.out.println(c[i]);
		}
		x.close();
	}
}

