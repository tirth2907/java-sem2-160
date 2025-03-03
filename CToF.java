import java.util.Scanner;
public class CToF{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("give tempurature in c = ");
		float c = sc.nextFloat();
		System.out.println("in F = " + (c*(9/5) + 32)); 

		System.out.println("give tempurature in f = ");
		float f1 = sc.nextFloat();

		float c1 = (5/9.0f)*(f1 - 32);
		System.out.println("in C = " + c1); 

	}
}