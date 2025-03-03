import java.util.Scanner;
public class Mark 
{
	public static void main (String[] args )
	{
		Scanner Sc = new Scanner(System.in) ;
		int a=0 ;
		double sum =0;
		for (int i = 1 ;i<=5;i++)
		{
		System.out.println("give your marks :");
		int marks = Sc.nextInt();	
		a=a+marks;
		}
		sum= a/5.0;


		if (sum<40)
		{
			System.out.println("you are fail");
		}
		else if (sum >= 40 && sum <= 49 )
		{
			System.out.println("you are in 3 division ");
		}
		else if (sum >= 50 && sum <= 59 )
		{
			System.out.println("you are in 2 division ");
		}
		else if (sum >= 60)
		{
			System.out.println("you are in 1 division "); 
		}

		
	}
}                                                                          
