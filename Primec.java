import java.util.Scanner;
public class Primec
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float  x=0222222f;
		System.out.println("give a ");
		int a = sc.nextInt();
		System.out.println("give b ");
		int b = sc.nextInt();

		while(x<=b)
		{
			int n=0,i=1;
		for (i=1;i<=a;i++)
		{
			if (a%i== 0)
			{
				n++;
			}
		}
		if (n==1)
			{
				System.out.println(x);
				x++;
			}
		}
	}
}