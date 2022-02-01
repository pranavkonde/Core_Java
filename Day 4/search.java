import java.util.*;
class search {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int a[]=new int[5];
		int k=0;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the number: ");
			a[i]=x.nextInt();
		}
		System.out.println("Enter the number to be searched: ");
		int j=x.nextInt();
		int count=0;
		for(int i=0;i<5;i++)
		{
			if(a[i]==j)
			{
				count++;
				k=i;
			}
		}
		if(count!=0)
		{
			System.out.println("Element found at Index: "+k);
		}
		else
		{
			System.out.println("Element not found");
		}
		x.close();
	}

}
