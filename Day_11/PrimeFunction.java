import java.util.Scanner;

public class PrimeFunction {

    static boolean checkPrime(int n)
    {
        if(n <= 1)
            return false;

        for(int i = 2; i < n; i++)
        {
            if(n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(checkPrime(num))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}