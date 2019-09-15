
import hsa.Console;
import java.awt.Color;


public class Wagon {

   
    public static void main(String[] args) {
       Console c = new Console();
       //SKY
       c.setColor(Color.cyan);
       c.fillRect(1, 1, 800, 800);      
       //SUN
       c.setColor(Color.yellow);
       c.fillOval(530, 50, 80, 80);
       //GRASS
       c.setColor(Color.green);
       c.fillRect(0, 335, 800, 800);
       //WAGON
       c.setColor(Color.red);
       c.fillRect(140, 205, 280, 95);
       //WHEEL 1
       c.setColor(Color.black);
       c.fillOval(160, 285, 50, 50);
       //WHEEL 2
       c.setColor(Color.black);
       c.fillOval(355, 285, 50, 50);
       //HANDLE
       c.setColor(Color.black);
       c.drawLine(50, 130, 140, 205);
    }
    
}
