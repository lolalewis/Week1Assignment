
import hsa.Console;
import java.awt.Color;
import java.util.Random;

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
       int height;
       //for loop for 4 bars
        for (int i = 0; i < 4; i++) {
            //make sure data is from 10-400
            while(true){
                c.print("Enter a height for bar " + (i+1) + "(max 400) > ");
                height = c.readInt();
                if(height <=400 && height >=10){
                    break;
                }else{
                    c.print("Error number must be lower than 400\n");
                
                }
            }
            c.setColor(rng()); // random color using method below
            c.fillRect(50 + 100 * i, 500-height, 50,height);
            c.drawString("Value: "+ height, 50 +100*i, 500-height-20);
        }
    }
        public static Color rng(){
        Random r = new Random();
        return new Color (r.nextInt(255),r.nextInt(255),r.nextInt(255));
        
               
    }

}
