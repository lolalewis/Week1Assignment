
import hsa.Console;
import java.awt.Color;


public class Wagon {

   
    public static void main(String[] args) {
       Console c = new Console();
       //SUN
       c.setColor(Color.yellow);
       c.fillOval(530, 50, 90, 90);
       //SKY
       c.setColor(Color.cyan);
       c.fillRect(600, 400, 0, 0);
       
    }
    
}
