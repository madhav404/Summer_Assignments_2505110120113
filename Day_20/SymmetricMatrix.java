import java.util.Scanner;

public class SymmetricMatrix {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];
        int flag = 1;

        System.out.println("Enter matrix elements:");

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(a[i][j] != a[j][i])
                {
                    flag = 0;
                }
            }
        }

        if(flag == 1)
        {
            System.out.println("Symmetric Matrix");
        }
        else
        {
            System.out.println("Not a Symmetric Matrix");
        }
    }
}