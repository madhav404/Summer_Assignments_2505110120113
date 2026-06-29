import java.util.Scanner;

class Q118 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String books[] = {"Java","Python","C","C++","HTML"};
        boolean issued[] = new boolean[5];

        int choice;

        do {
            System.out.println("\n--- Mini Library ---");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    for(int i=0;i<5;i++) {
                        if(issued[i])
                            System.out.println((i+1)+". "+books[i]+" (Issued)");
                        else
                            System.out.println((i+1)+". "+books[i]+" (Available)");
                    }
                    break;

                case 2:
                    System.out.print("Enter Book Number: ");
                    int issue = sc.nextInt();

                    if(!issued[issue-1]) {
                        issued[issue-1] = true;
                        System.out.println("Book Issued.");
                    }
                    else
                        System.out.println("Already Issued.");
                    break;

                case 3:
                    System.out.print("Enter Book Number: ");
                    int ret = sc.nextInt();

                    issued[ret-1] = false;
                    System.out.println("Book Returned.");
            }

        } while(choice != 4);

        System.out.println("Thank You");
    }
}