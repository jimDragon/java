import java.util.Scanner;

public class IntScanner_ext {

    public static void main(String[] args) {
        
        // Importing data
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int i1 = sc.nextInt();
        System.out.println("Enter a second integer: ");
        int i2 = sc.nextInt();

        // Printing results
        System.out.println("1st int - " + i1);
        System.out.println("2nd int - " + i2);
        System.out.println("Addition: " + i1 + " + " + i2 + " = " + (i1+i2));
    }
}