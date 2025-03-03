import java.util.Scanner;
public class Odd
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		System.out.println("give a no. ");
		int a = Sc.nextInt();

		if (a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		
	}
}