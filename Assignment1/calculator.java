package Assignment1;
import java.util.Scanner;

/**
 * calculator
 */
public class calculator {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Input");
        int A = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Second Input");
        int B =  Integer.parseInt(sc.nextLine());

        System.out.println("Enter the operation you want to perform Input");
        String operation = sc.nextLine();

        int result;
        switch(operation)
        {
            case "+":
                result = A + B;
                break;
                case "-":
                    result = A - B;
                    break;
                case "*":
                    result = A * B;
                    break;
                case "/":
                    result  = A / B;
                    break;
                default:
                    result = 0;
        }
        System.out.println("Result is : " + result);
        
        sc.close();

    }
}