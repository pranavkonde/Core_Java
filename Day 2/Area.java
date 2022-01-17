import java.util.*;
public class Area {
	public static void main(String[] args)
	{
		int base,height,radius,c;
		double area;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the base: ");
		base=x.nextInt();
		System.out.println("Enter the height: ");
		height=x.nextInt();
		System.out.println("Enter the radius: ");
		radius=x.nextInt();
		System.out.println("Area of: ");
		System.out.println("\n1.Circle\n2.Triangle\n3.Square\n4.Rectangle");
		c=x.nextInt();
		switch(c)
		{
		case 1:
			area=radius*radius*(3.14);
			System.out.println("Area of circle is: "+area);
			break;
		case 2:
			area=base*height*(0.5);
			System.out.println("Area of traingle is: "+area);
			break;
		case 3:
			area=base*base;
			System.out.println("Area of Square is: "+area);
			break;
		case 4:
			area=base*height;
			System.out.println("Area of Rectangle is: "+area);
			break;
		}
		x.close();
	}
}