
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import TurtleGraphics.Pen;
//import hsa.Console;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {

    public static void main(String[] args) {
       
        Penbar pb1, pb2, pb3, pb4;
        Scanner s = new Scanner(System.in);
         //Console c = new Console();
     
        pb1 = new Penbar();
        pb2 = new Penbar();
        pb3 = new Penbar();
        pb4 = new Penbar();
       
        int width,x,yloc;
      
        //4 bars
        System.out.println("Enter width for bar 1: ");
        pb1.width=s.nextInt();
        
        
        System.out.println("Enter width for bar 2: ");
        pb2.width=s.nextInt();
        
        
        System.out.println("Enter width for bar 3: ");
        pb3.width=s.nextInt();
        
        
        System.out.println("Enter width for bar 4: ");
        pb4.width=s.nextInt();
        
        
        Pen p = new StandardPen(new SketchPadWindow(800, 600));

        makeBar(p, pb1, -350, 200, pb1.width, Color.blue);
        makeBar(p, pb2, -350, 100, pb2.width, Color.red);
        makeBar(p, pb3, -350, 0, pb3.width, Color.green);
        makeBar(p, pb4, -350, -100, pb4.width, Color.orange);
 
    }

    public static void makeBar(Pen p, Penbar pb, int x, int y, int w, Color c) {
       pb.xloc =x;
       pb.yloc = y;
       pb.width = w;
       pb.col = c;
       pb.draw(p);
       

    }

}
