import java.util.Scanner;
public class Mf{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("give masurment in m =");
		float a = sc.nextFloat();
		float b = 3.28084f * a ;
		System.out.println(b);

		
	}
}