//Question 9- Accept the Principle amount, time & rate of interest
// and calculate the Simple Interest
import java.util.Scanner;
public class Demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int P,r,t;
        System.out.println("enter principle amount :");
        int P =sc.nextInt();
        System.out.println("enter the rate of interest :");
        int r = sc.nextInt();
        System.out.println("enter the time :");
        int t = sc.nextInt();
        int A = (P*r*t)/100;
        System.out.println(A);
    }
}
//complexity : O(n)
