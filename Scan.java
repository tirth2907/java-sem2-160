import java.util.Scanner;

public class Scan{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("give first int :");
		int a=sc.nextInt();
		System.out.println("give first double :");
		double b=sc.nextDouble();

		System.out.println("give first string :");
		String c=sc.next();

		System.out.println();
		System.out.println("give second str :");
		String d=sc.nextLine();



		System.out.println(a); 
		System.out.println(b); 
		System.out.println(c); 
		System.out.println(d); 
	}
}