import java.util.Scanner;

public class Pallindrome
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("give a no. ");
		int a = sc.nextInt();
		int b = 0,c=a;

		for (int i=0 ;a>0;i++)
		{
			b =b*10 + (a%10);

			a =( a/10);
		}
		if (c==b)
		{
			System.out.println(c + "is Pallindrome");
		}
		else
		{
			System.out.println(c + "is not Pallindrome");
		}
	}
}
