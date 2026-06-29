import java.util.Scanner;

class Q114 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, choice;
        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        do {
            System.out.println("\n--- Array Menu ---");
            System.out.println("1. Display Array");
            System.out.println("2. Find Sum");
            System.out.println("3. Find Maximum");
            System.out.println("4. Search Element");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Array Elements:");
                    for (int i = 0; i < n; i++)
                        System.out.print(arr[i] + " ");
                    System.out.println();
                    break;

                case 2:
                    int sum = 0;
                    for (int i = 0; i < n; i++)
                        sum += arr[i];
                    System.out.println("Sum = " + sum);
                    break;

                case 3:
                    int max = arr[0];
                    for (int i = 1; i < n; i++)
                        if (arr[i] > max)
                            max = arr[i];
                    System.out.println("Maximum = " + max);
                    break;

                case 4:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == key) {
                            System.out.println("Element found at index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Element not found.");
                    break;
            }

        } while (choice != 5);

        System.out.println("Program Ended.");
    }
}