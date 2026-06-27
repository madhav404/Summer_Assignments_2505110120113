import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        String department;

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Department: ");
        department = sc.nextLine();

        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
    }
}