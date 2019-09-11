import hsa.*;
import java.awt.Color;
public class BarChart2 {

    public static void main(String[] args) {
       Console c = new Console();
       Bar b1 = new Bar();
       Bar b2 = new Bar();
       Bar b3 = new Bar();
       Bar b4 = new Bar();
       //bar 1       
       c.print("Enter height of bar1> ");
         
       b1.xloc = 200;
       b1.height =300;
       b1.col = Color.red;
       //bar 2
       
      c.print("Enter height of bar2>  ");
       
       b2.xloc = 300;
       b2.height= 50;
       b2.col = Color.green;
       //bar3
       c.print("Enter the height of bar3> ");
       b3.xloc = 400;
       b3.height= 50;
       b3.col = Color.blue;
       //bar 4
       c.print("Enter the height of bar4> ");
       b4.xloc = 500;
       b4.height= 50;
       b4.col = Color.yellow;
       
       
       //draw the bars
       b1.draw(c);
       b2.draw(c);
       b3.draw(c);
       b4.draw(c);
       
       
       
    }
    
}
