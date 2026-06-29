import java.util.Scanner;

class Q119 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String empName[] = new String[10];
        double salary[] = new double[10];

        int count = 0, choice;

        do {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Employee Name: ");
                    empName[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;
                    break;

                case 2:
                    System.out.println("\nEmployee Details");
                    for(int i=0;i<count;i++) {
                        System.out.println(empName[i]+"   Salary = "+salary[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee Name: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for(int i=0;i<count;i++) {
                        if(empName[i].equalsIgnoreCase(search)) {
                            System.out.println("Name : "+empName[i]);
                            System.out.println("Salary : "+salary[i]);
                            found = true;
                        }
                    }

                    if(!found)
                        System.out.println("Employee Not Found.");
            }

        } while(choice != 4);

        System.out.println("Program Closed.");
    }
}