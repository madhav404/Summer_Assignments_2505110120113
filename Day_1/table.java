
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,a;
        System.out.println("enter the number  whose table has to be printed : ");
        i=sc.nextInt();
        for(j=0;j<=10;j++)
        {
            a=i*j;
            System.out.println( a );
//OR CAN BE USED [sop(i "*" j "=" a );]
        }
        sc.close();
    }
    
}
