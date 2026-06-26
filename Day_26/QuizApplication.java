import java.util.Scanner;

public class QuizApplication {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int ans;

        System.out.println("Q1. Java is developed by?");
        System.out.println("1. Microsoft");
        System.out.println("2. Sun Microsystems");
        System.out.println("3. Google");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if(ans == 2)
        {
            score++;
        }

        System.out.println();

        System.out.println("Q2. Which keyword is used to create an object?");
        System.out.println("1. new");
        System.out.println("2. class");
        System.out.println("3. public");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();

        if(ans == 1)
        {
            score++;
        }

        System.out.println();

        System.out.println("Your Score = " + score + "/2");
    }
}