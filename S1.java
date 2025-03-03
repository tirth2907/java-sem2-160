import java.util.Scanner;
public class S1{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("give a word :");
		String s1 = sc.nextLine();
		int x = s1.length();
		char ch = s1.charAt(x);
		for (int i = 1; i<=x;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.println(ch);
			}
			System.out.println();
		}
	}
}