import hsa.*;
import java.awt.Color;
public class BarChart2 {

    public static void main(String[] args) {
       Console c = new Console();
       //array of 4 colors for 4 bars
       Color col[] = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};
       Bar b[] = new Bar[4]; //empty array for 4 bars
        for (int x = 0; x < 4; x++) {
            b[x] = new Bar(); //new actual bar at location x in array
            c.print("Enter bar " + (x+1) + " height >");
            //assign bar height, xloc, color
            b[x].height = c.readInt();
            b[x].xloc = 50 + (100*x);
            b[x].col = col[x];
            //draw
            b[x].draw(c);
        }
       
       
       
    }
    
}
