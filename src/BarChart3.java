
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import TurtleGraphics.Pen;
import hsa.Console;
import java.awt.Color;
import java.util.Scanner;

public class BarChart3 {

    public static void main(String[] args) {
        Pen p = new StandardPen(new SketchPadWindow(800, 600));
        Penbar pb1, pb2, pb3, pb4;
        Scanner scan = new Scanner(System.in);
        Console c = new Console();
        // Penbar[] = new 
        pb1 = new Penbar();
        pb2 = new Penbar();
        pb3 = new Penbar();
        pb4 = new Penbar();

          int width;
        //for loop for bars
        for (int i = 0; i < 4; i++) {
            while (true) {
                c.print("Enter width for bar " + (i + 1) + "(max400)>");
                width = c.readInt();
                if (width <= 400 && width > 10) {
                    break;
                } else {
                    c.print("Error number must be lower than 400\n");
                }
            }
        }

        makeBar(p, pb1, -350, 200, pb1.width, Color.blue);
        makeBar(p, pb2, -350, 100, pb1.width, Color.red);
        makeBar(p, pb3, -350, 0, pb1.width, Color.green);
        makeBar(p, pb4, -350, -100, pb1.width, Color.orange);

    }

    public static void makeBar(Pen p, Penbar pb, int x, int y, int w, Color c) {
     //  pb.x = x;
     //   pb.y = y;
        pb.width = w;
       // pb.draw(p);

    }

}
