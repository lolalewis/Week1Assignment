
import java.util.Scanner;


public class PizzaCost {
  
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in) ;
      double size, toppings,heat,base,pizza;
        System.out.println("Enter the size of the pizza in inches > ");
        size= s.nextDouble();
        size +=1.50;
        heat = s.nextDouble();
        heat+= 0.75;
        toppings =s.nextDouble();
        toppings+=0.75;
        base = s.nextDouble();
        base= 0.50*size;
        pizza= s.nextDouble();
        pizza= size+heat+toppings+base;
        System.out.format("Your pizza  is done. \n",pizza);
       
        
    }
    
}
