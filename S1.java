import java.util.Scanner;
public class S1{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("give a word :");
		String s1 = sc.nextLine();
		int x = s1.length();
		
		for (int i = 0; i<=x-1;i++)
		{
			for (int j=0;j<=i;j++)
			{
				char ch = s1.charAt(j);
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}