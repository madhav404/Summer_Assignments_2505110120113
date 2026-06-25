import java.util.Scanner;

public class MergeSortedArrays {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};

        int arr3[] = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                arr3[k] = arr1[i];
                i++;
            }
            else
            {
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < arr1.length)
        {
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while(j < arr2.length)
        {
            arr3[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("Merged Array:");

        for(i = 0; i < arr3.length; i++)
        {
            System.out.print(arr3[i] + " ");
        }
    }
}