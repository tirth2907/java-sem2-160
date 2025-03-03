import java.util.Scanner;

public class Vowel{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("give a string ");
		String s = sc.nextLine();
		int len = s.length();
		char ch;
		//System.out.println(len);
		for (int i=0;i<len;i++)
			{
			    ch = s.charAt(i);
				if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					System.out.println(ch + "is vowel");
				}
				
				else
				{
					System.out.println(ch + "is consonnant");
				}
			}

	}
}