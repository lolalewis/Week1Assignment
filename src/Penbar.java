import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;
import hsa.Console;
import java.awt.Color;

public class Penbar {
    int xloc,yloc, height;
     Pen p = new StandardPen();   
     Color col;
     
    public void draw(Console c){
        p.up();
        p.move(xloc,yloc);
        p.down();
        p.setWidth(50);
        c.setColor(col);
         p.setDirection(0);
       //  p.move(width);
    }
}
