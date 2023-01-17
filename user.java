import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element :");
        n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter Values :");
        for(i=0;i<n;i++)
        {
            a[i] =sc.nextInt();
        }
        System.out.println("Elements are :");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
    }
}
