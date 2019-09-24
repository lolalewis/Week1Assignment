
import java.util.Set;
import javax.swing.JOptionPane;

public class PizzaCostJFrame {

    public static void main(String[] args) {

        final double LABOUR = 1.50, HEAT = 0.75;
        final double PERTOP = 0.75, PERINCH = 0.5;
        double size, toppings, totalcost, sizetotal, toptotal;
        
        

    public PizzaCostJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void numoftoppingsActionsPerformed(java.awt.event.ActionEvent evt) {
    }
    private void pizzasizeActionPeformed(java.awt.event.ActionEvent evt) {
    }
    private void hungrybtnActionPerformed(java.awt.event.ActionEvent evt) { 
       try{
           size = Double.parseDouble(pizzasize.getText());
       } catch (Execption e){
           JOptionPane.showMessageDialog(this,"Error - enter a number");
           pizzasize.setText("");
           numtoppings.setText("");
           return;
           
       }
       sizetotal = PERINCH * size;
       try{
           toppings = Double.parseDouble(this,"Error - enter a number");
           pizzasize.setText("");
           numtoppings.setText("");
           return;
       }
       toptotal = PERTOP * toppings ;
       totalcost = LABOUR + HEAT + sizetotal + toptotal;
       totalprice.setText("The pizza costs $"+totalcost);
     }
    
    
}
