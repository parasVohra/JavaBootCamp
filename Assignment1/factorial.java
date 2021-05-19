package Assignment1;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter the integer to get factorial");
        Scanner sc = new Scanner(System.in);
       
        int input = Integer.parseInt(sc.nextLine());
        int factorial = 1;

        for (int i = 1; i <= input; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        sc.close();
    }
}
