package simple_iteration._method;

public class OriginalFX {
   
    double ORFX(double  x,int decimalPlacessss){
        
       return DecimalUtils.round(Math.pow(x,6) - x - 1, 4);
      // 2     return Math.pow(x,2)- 5 * x + 6;
      
      // 3  return Math.pow(x, 2) - 3 * x - 2;
    }
}
