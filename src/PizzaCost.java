
import java.util.Scanner;


public class PizzaCost {
  
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in) ;
      // CONSTANTS for fixed price amounts
      final double LABOUR = 1.5, HEAT = 0.75;
      final double PERTOP = 0.75, PERINCH =.5;
      //variables required
      double size, toppings, totalcost;
      //ask for inputs
        System.out.print("Enter Size of pizza: ");
        size = s.nextDouble();
        System.out.print("How many toppings?; ");
        toppings = s.nextDouble();
        //calculate total & show total cost
        totalcost = LABOUR + HEAT + (toppings * PERTOP) + (size + PERINCH);
        System.out.format("Total cost of your pizza is $%.2f\n", totalcost);      
      
       
        
    }
    
}
