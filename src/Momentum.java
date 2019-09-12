
import java.util.Scanner;

public class Momentum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double velocity, mass, momentum;    
        System.out.print("Enter a Mass in kg's: ");
        mass = scan.nextDouble();
        System.out.format("Enter a Velocity in m/s: ");       
        velocity = scan.nextDouble();      
        //momentum calculation 
        momentum = mass*velocity;
        System.out.format("Your objects momentum will be %.2f\n",momentum);
      
                    
        
        
        
    }

}
