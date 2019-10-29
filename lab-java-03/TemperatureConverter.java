import java.util.Scanner;

public class TemperatureConverter {
<<<<<<< HEAD
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
=======
  private int tempC;

  // Only default constructor, by compiler!!! (lazy approach)
  public void setCelcius(int t){
    if ( t>=-274 )    // Temp below 0oKelvin considered out of bounds.
      this.tempC = t;
    else
      System.out.println("Temp too cold!!!");
  }
  public int getCelcius() {
    return this.tempC;
  }
  public void setFahrenheit(int t){
    // int c = (int)((t-32)*(5.0/9));   // Double -> Int convert C -> F
    int c = (t-32)*5/9;   // Int convert (ignore decimal) C -> F
    this.setCelcius(c); // Reuse setCelcius in order to
                        // expoit -274 check
  }
  public int getFahrenheit() {
    int f = this.tempC*9/5 +32;
    return f;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Temperacture ").append(this.tempC).append("oC ")
      .append(this.getFahrenheit()).append("oF");
    return sb.toString();
  }

  public static void main(String[] args){
    int t =0;
    Scanner sc = new Scanner(System.in);
    TemperatureConverter tc = new TemperatureConverter();
    do {
      System.out.print("Type oF: ");
      t = sc.nextInt();
      tc.setFahrenheit(t);
      System.out.println(tc.toString());
    } while (t>=-274);
  }

}
>>>>>>> upstream/master
