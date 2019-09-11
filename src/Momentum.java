
import java.util.Scanner;

public class Momentum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double velocity, mass, momentum;
        
        //mass
        System.out.println("Enter a number for mass in kg's: ");
        mass = scan.nextDouble();
        System.out.format("You entered the number %.2f.\n", mass);
        //velocity
        System.out.println("Enter a number for velocity in m/s");
        velocity = scan.nextDouble();
        System.out.format("You entered the number %.2f.\n", velocity);
        //momentum 
        
        while(true){
            momentum = scan.nextDouble();
       //     momentum = mass*velocity
        System.out.format("Your objects momentum will be %.2f . \n",momentum);
      
                    
        //System.out.format("Your objects momentum will be %.2f . \n",momentum);
        }
        
    }

}
