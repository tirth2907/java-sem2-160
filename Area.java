import java.util.Scanner;
public class Area{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("give l =");
		float l = sc.nextFloat();
		System.out.println("give b =");
		float b = sc.nextFloat();

		float area = l*b;
		System.out.println("area of rectangle is " + area); 
	}

}