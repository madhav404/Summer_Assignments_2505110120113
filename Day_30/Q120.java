import java.util.Scanner;

class Q120 {

    static String name[] = new String[10];
    static int marks[] = new int[10];
    static int count = 0;

    static void addStudent(Scanner sc) {
        System.out.print("Enter Name: ");
        name[count] = sc.next();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;
        System.out.println("Student Added.");
    }

    static void displayStudent() {
        System.out.println("\nStudent List");
        for(int i=0;i<count;i++) {
            System.out.println(name[i]+"  "+marks[i]);
        }
    }

    static void searchStudent(Scanner sc) {
        System.out.print("Enter Name: ");
        String search = sc.next();

        boolean found = false;

        for(int i=0;i<count;i++) {
            if(name[i].equalsIgnoreCase(search)) {
                System.out.println("Name : "+name[i]);
                System.out.println("Marks : "+marks[i]);
                found = true;
            }
        }

        if(!found)
            System.out.println("Student Not Found.");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    displayStudent();
                    break;

                case 3:
                    searchStudent(sc);
                    break;
            }

        } while(choice != 4);

        System.out.println("Project Ended.");
    }
}