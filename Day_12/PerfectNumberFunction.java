import java.util.Scanner;

public class PerfectNumberFunction {

    static boolean perfect(int num)
    {
        int sum = 0;

        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }

        if(sum == num)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(perfect(num))
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}