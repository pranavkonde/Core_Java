import java.util.Scanner;
public class saddlepoint {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[]=new int[3];
		int c[]=new int[3];
		Scanner x= new Scanner(System.in);
		System.out.println("Enter elements for array: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=x.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			int max=0;
			int min=10000;
			for(int j=0;j<3;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];		
				}
				if(a[j][i]<min)
				{
					min=a[j][i];
				}
				c[i]=max;
				b[i]=min;
		}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(c[i]==b[j])
				{
					System.out.println("Saddle point is:"+c[i]);
				}
			}
		}
		x.close();
	}
}