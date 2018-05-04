package simple_iteration._method;
import javax.swing.JOptionPane;
/*
 *
 * @author Mohammed Rowad
 */
public class Simple_iteration_method {
    public static void main (String[] args)  {
        OriginalFX Fx = new OriginalFX();
        Gfunction Gx = new Gfunction();
        // result is x1
        double result, x0, toleranceValue;
        int iterationNUM = 1;
        int MAX;
        // input using GUI The values comes as a strings
       String initialGuess = JOptionPane.showInputDialog("Enter the initial guess (x0)"); 
       String tolerance_Value = JOptionPane.showInputDialog("Enter the Tolerance Value");
       String M_A_X = JOptionPane.showInputDialog("Enter the maximem number of iteration");
       // Here we convert from Strings to doubles
       x0  = Double.parseDouble(initialGuess);
       toleranceValue = Double.parseDouble(tolerance_Value);
       MAX = Integer.parseInt(M_A_X);
       // here we find the round off value
       String toleranceValueCONVERT = Double.toString(Math.abs(toleranceValue));
       //JOptionPane.showMessageDialog(null, toleranceValueCONVERT.length());
       int integerPlaces = toleranceValueCONVERT.indexOf('.');
       int decimalPlaces = toleranceValueCONVERT.length() - integerPlaces - 1;
        if (toleranceValueCONVERT.length()>0) {
         String  decimalPlacesVALUE = JOptionPane.showInputDialog("how many digit you want to round off?? enter");
         decimalPlaces = Integer.parseInt(decimalPlacesVALUE);
        }
       // loop to find the root and x1 in every iterarion
       while(iterationNUM <= MAX){
           // calling a method from  class  "DecimalUtils" to round off the result (x1)
       result = DecimalUtils.round(Gx.GG(x0),decimalPlaces);
       // result = Gx.GG(x0);
           //absolute value of | x1 - x0 |   P.s result is x1
           double absolute_value = Math.abs(result - x0);
           
           // here we check if we found the root by Subtract | x1 (result) - x0 (initial guess) | in every iteration
           if (absolute_value < toleranceValue  || Fx.ORFX(result,decimalPlaces)  == 0) {
               JOptionPane.showMessageDialog(null, "The root =  "+DecimalUtils.round(result,decimalPlaces) + "   In teration  number   " + iterationNUM );
               JOptionPane.showMessageDialog(null, " The F(x1) "+Fx.ORFX(result,decimalPlaces));
               break;
           }
           JOptionPane.showMessageDialog(null, " The F(x1) "+Fx.ORFX(result,decimalPlaces));
           // here we out put the x1 (result value) in every iteration
           JOptionPane.showMessageDialog(null, "x1 in iteration number " + iterationNUM +" is "+
                   result + " And |x1 - x0| < " + toleranceValue + "So we continue"  );
           // x0 = x1 to the next iteration !
           x0 = result;
           // starting the next iteration 
       iterationNUM++;
       }
       //When iteration number is bigger then MAX means the root is not found
        if (iterationNUM > MAX) {
       iterationNUM--;
       JOptionPane.showMessageDialog(null, "The root can't be found after "+ iterationNUM +" Iterations!!"); 
        }
    } 
}