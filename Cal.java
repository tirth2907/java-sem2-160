import java.util.Scanner;
public class Cal{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("give a no  = ");
		int a = sc.nextInt();

		sc.nextLine();

		System.out.println("give operation = ");
		String oper = sc.next();

		sc.nextLine();

		System.out.println("give no. =");
		int b = sc.nextInt();
		

		if(oper.equals("+"))
		{
			System.out.println("ans is =" + (a+b));
		}
		else if (oper.equals("-"))
		{
			System.out.println("ans is =" + (a-b));
		}
		else if (oper.equals("*"))
		{
			System.out.println("ans is =" + (a*b));
		}
		else if (oper.equals("/"))
		{
			System.out.println("ans is =" + (a/b));
		}
		else
		{
			System.out.println("invalid");
		}



	}
}