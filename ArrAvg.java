import java.util.Scanner;
public class ArrAvg
{
	public static void main (String[] args)

	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter the size of array :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0 ;
		for (int i=0 ; i < n ; i++  )
		{
			System.out.println("give ele of arr [" + i + "]");
			arr[i] = sc.nextInt();
			sum+= arr[i];
		}
		double avg = 0 ;
		avg = (double)sum/n;
		System.out.println(avg);
	}
}