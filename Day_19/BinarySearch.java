import java.util.Scanner;

public class BinarySearch {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = arr.length - 1;
        int found = 0;

        while(low <= high)
        {
            int mid = (low + high) / 2;

            if(arr[mid] == key)
            {
                System.out.println("Element found at position " + (mid + 1));
                found = 1;
                break;
            }
            else if(arr[mid] < key)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        if(found == 0)
        {
            System.out.println("Element not found");
        }
    }
}