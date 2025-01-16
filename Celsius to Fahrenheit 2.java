import java.util.*;

public class Main {
    public static void main(String[] args) {
        
      int temperature ;

      Scanner scr = new Scanner(System.in);

      temperature = scr.nextInt();

    double celsius = (temperature * 1.8) + 32;

    System.out.printf("%.6f",celsius);

    }
}
