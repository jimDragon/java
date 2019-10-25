import java.util.Scanner;

public class TemperatureConverter {
    int celsius = 0;                    // Temperature in C
    
    // Default Constructor
    public TemperatureConverter(int temp) {
        this.celsius = temp;
    }
    
    // Modifier for Celsius
    public void setCelsius(int c) {
        this.celsius = c;
    }

    // Modifier for Fahrenheit
    public void setFahrenheit(int f) {
        this.celsius = (f-32)*5/9;    // Conversion from F to C
    }

    // Accessor for Celsius
    public int getCelsius() {
        return this.celsius;
    }

    // Accessor for Fahrenheit
    public int getFahrenheit() {
        return (this.celsius * 9/5)+32; // Conversion from C to F
    }

    // ToString method
    public String toString() {
        return "Temperature is: " + this.celsius + "C or " + ((this.celsius * 9/5)+32) + "F!";
    }

    public static void main(String[] args) {

        // Input
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a desired temperature");
        int temperature = sc.nextInt();
        TemperatureConverter temp = new TemperatureConverter(temperature);
        temp.setFahrenheit(temperature);
        
        // Output
        // System.out.println(temp.getFahrenheit());
        // System.out.println(temp.getCelsius());
        System.out.println(temp.toString());
    }
}