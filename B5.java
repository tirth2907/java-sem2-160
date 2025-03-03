import java.util.Scanner;
public class B5 
{
	public static void main(String[] args)
	{
		Scanner var = new Scanner(System.in);
		System.out.println("give a char :");
		char x = var.next().charAt(0);
		if (x=='a'|| x=='e'|| x=='i'|| x=='o'|| x=='u')
		{
			System.out.println("vowel");
		}
		else 
		{
			System.out.println("constant");
		}
	}
}