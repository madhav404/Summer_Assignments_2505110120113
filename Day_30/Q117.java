import java.util.Scanner;

class Q117 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[10];
        int marks[] = new int[10];
        int count = 0, choice;

        do {
            System.out.println("\n--- Student Record System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Student Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextInt();

                    count++;
                    System.out.println("Student Added.");
                    break;

                case 2:
                    System.out.println("\nStudent Records");
                    for(int i=0;i<count;i++) {
                        System.out.println((i+1)+". "+name[i]+"  Marks = "+marks[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter Student Name: ");
                    String search = sc.nextLine();
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

        } while(choice != 4);

        System.out.println("Program Ended.");
    }
}