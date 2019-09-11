
import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;
import hsa.Console;
import java.awt.Color;

public class Penbar {

    int xloc, yloc, width;
    Pen pb = new StandardPen();
    Color col;

    public void draw(Console c) {
        pb.up();
        pb.move(xloc,yloc);       
        pb.down();
        pb.setWidth(50);
        c.setColor(col);
        pb.setDirection(0);
        pb.move(width);
        pb.drawString("Width: " + width); 
    }
}
