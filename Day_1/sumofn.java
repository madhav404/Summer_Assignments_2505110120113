import java .util.Scanner;
public class sumofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,add=0;
        System.out.println("Enter the value of n "); 
         i=1;
         while (i<=n)
         {
            add=add+i;
            i=i+1;
         }
         System.out.println("addition="+add);
        }
    }