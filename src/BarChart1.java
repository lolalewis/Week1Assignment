
import hsa.Console;
import java.awt.Color;

public class BarChart1 {
    static Console c;

    public static void main(String[] args) {
        Console c = new Console();
       /* c.setColor(Color.yellow);
        c.fillStar(200, 100, 50, 50);
        c.fillStar(200, 175, 50, 50);
        c.setColor(Color.black);
        c.drawStar(200, 100, 50, 50);
        c.drawStar(200, 175, 50, 50);
        //red box
        c.setColor(Color.red);
        c.fillRect(250, 100, 200, 100);
        c.fillOval(50, 400, 100, 50);
        c.setColor(Color.black);
        c.drawRect(50,400,100,50);
        
        c.setColor(Color.blue);
        c.drawString("Hello There", 300, 300);
*/
       int h1,h2,h3,h4;
       c.print("Enter height of bar1> ");      
       h1= c.readInt();
       c.setColor(Color.RED);
       //1st bar
       c.fillRect(100, 500-h1, 50, h1);
       c.drawString("Value: "+ h1, 100,500-h1-20);
       
       //2nd bar
       c.print("Enter height of bar2> ");       
       h2= c.readInt();
       c.setColor(Color.blue);
       c.fillRect(200, 500-h2, 50, h2);
       c.drawString("Value: "+ h2, 200,500-h2-20);
       
       //3rd bar
       c.print("Enter height of bar3> ");       
       h3= c.readInt();
       c.setColor(Color.red);
       c.fillRect(300, 500-h3, 50, h3);
       c.drawString("Value: "+ h3, 300,500-h3-20);
       
       //4th bar
       c.print("Enter height of bar4> ");       
       h4= c.readInt();
       c.setColor(Color.blue);
       c.fillRect(400, 500-h4, 50, h4);
       c.drawString("Value: "+ h4, 400,500-h4-20);
               
    }

}
