import java.util.Scanner;
import java.lang.Math;

class Calculator {
    
    public static double tempDropCalc (double g, double h) {
        return h / (500 * g);
    }
    
    public static void main(String[] args) {
        
        Scanner Scanner = new Scanner(System.in);
        
        System.out.println("Enter gallons per minute");
        
        double gpm = Scanner.nextDouble();
        
        System.out.println("Enter radiator BTU");
        
        double btu = Scanner.nextDouble();
        
        double tempDrop = tempDropCalc(gpm, btu);
        
        System.out.println("Temperature drop across the radiator is " + tempDrop);
    }
}
