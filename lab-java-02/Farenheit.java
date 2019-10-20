import java.util.Scanner;

public class Farenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a temperature in celcious: ");
        int temperature = sc.nextInt();
        int F = (temperature * 9/5)+32;
        System.out.println("Temperature in Farenheit is: " + F); 
    }
}