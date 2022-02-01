import java.util.*;
public class matrixmul {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		Scanner x= new Scanner(System.in);
		System.out.println("Enter elements for first array: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=x.nextInt();
			}
		}
		System.out.println("Enter elements for second array: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=x.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
			}
		}
		System.out.println("Multiplication is: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+c[i][j]);
			}
			System.out.println(" ");
		}
		x.close();
	}
}

