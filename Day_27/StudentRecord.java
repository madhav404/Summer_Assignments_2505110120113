import java.util.Scanner;

public class StudentRecord {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String name;
        int roll;
        String course;

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.println("\n----- Student Record -----");
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + roll);
        System.out.println("Course : " + course);
    }
}