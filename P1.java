public class P1
{
	public static void main (String[] args)
	{
		int i,j;
		for (i=1;i<=3;i++)
		{
			for (int k =2;k>=i;k--)
			{
				System.out.print(" ");
			}
			for (j=1;j<=i;j++)
			{
				System.out.print("* ");
			}	
			System.out.println();
		}
		for (i=1;i<=2;i++)
		{
			for (int k =1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for (j=2;j>=i;j--)
			{
				System.out.print("* ");
			}	
			System.out.println();
		}
	}
}