import java.util.Scanner;
public class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("give a number ");
		int a = sc.nextInt();
		int n=0,i=1;
		for (i=1;i<a;i++)
		{
			if (a%i== 0)
			{
				n++;
			}
		}
		if (n>1)
		{
			System.out.println(a + " is not prime no.");
		}
		else {
			System.out.println(a + " is prime no.");
		}
	}
}