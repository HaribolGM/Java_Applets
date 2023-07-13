// Program to find odd, even , positive and negative numbers.
import java.io.*;
import java.util.*;

public class program_switch_02 {

    public static void main(String[] args) throws IOException {

        int choice, num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Menu....");
        System.out.println("1.Find positive Or Negative");
        System.out.println("2.Find Odd/Even");
        System.out.println("Enter the choice : ");
        choice = Integer.parseInt(br.readLine());

        switch(choice) {
            case 1:
                System.out.println("Enter number:");
                num = Integer.parseInt(br.readLine());
                if(num > 0)
                    System.out.println("Positive");
                else
                    System.out.println("Negative");
                break;

            case 2:
                System.out.println("Enter number:");
                num = Integer.parseInt(br.readLine());
                if(num % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
                break;

            default:
                System.out.println("Wrong choice");
        }
    }
}
