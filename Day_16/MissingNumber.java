import java.util.Scanner;

public class MissingNumber {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        int total = (n + 1) * (n + 2) / 2;

        int missing = total - sum;

        System.out.println("Missing Number = " + missing);
    }
}