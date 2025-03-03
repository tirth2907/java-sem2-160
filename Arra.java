import java.util.Scanner;

public class Arra
{
    public static void main(String[] args)
    {
        int i,j=0,k,x=0,l;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 =new int[n];
        for(i=0; i<n; i++)
        {
        arr[i] = sc.nextInt();
        }
        System.err.println("Enter the number to be searched");
        int num = sc.nextInt();
        
        // x=(i-j);

        for (i=0; i<n;i++)
        {
            if(arr[i] == num)
            {
                System.out.println("The number is found at position" + i);
                j = i;
                break;
            }
        }
        x=i-j;
        for (k=0; k<i; k++)
        {
            arr1[k] = arr[j];
            j++;
        }
        x=i-j;
        for(k=j;k<x;k++)
        {
            arr1[k] = arr[i];
        }

        for(l=0;l<n;l++)
        {
            System.out.println(arr1[l]);
        }
    }
}
