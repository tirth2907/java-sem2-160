import java.util.Scanner;

public class Reverse
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter the size of array :");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println(n);
		int temp = 0,i=0 ;
		for ( i=0 ; i < n; i++  )
		{
			System.out.println("give ele of arr [" + i + "]");
			arr[i] = sc.nextInt();
		}
		for (int j=0 ; j<n/2 ; j++)
		{
			temp = arr[j];
			arr[j] = arr[(n-j)-1];
			arr[(n-j)-1] = temp;
		}
		for (i=0 ; i < n ; i++  )
		{
			System.out.println(arr[i]);
		}
	}
}