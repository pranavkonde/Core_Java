import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		{
			int a,b,c,d,e,average,total;
			Scanner x=new Scanner(System.in);
			System.out.println("Enter marks of five subjects: ");
			a=x.nextInt();
			b=x.nextInt();
			c=x.nextInt();
			d=x.nextInt();
			e=x.nextInt();
			total=(a+b+c+d+e);
			System.out.println("Total is: "+total);
			average=total/5;
			System.out.println("Average is: "+average);
			if (average>=90 && average<=100)
			{
				System.out.println("Grade: A");
			}
			else if(average>=80 && average<=89)
			{
				System.out.println("Grade: B");
			}
			else if(average>=70 && average<=79)
			{
				System.out.println("Grade: C");
			}
			else if(average>=60 && average<=69)
			{
				System.out.println("Grade: D");
			}
			else if(average>=50 && average<=59)
			{
				System.out.println("Grade: E");
			}
			else
			{
				System.out.println("Grade: F");
			}
			x.close();
		}
	}
}