package simple_iteration._method;

public class Gfunction {
    
    double GG (double x){
       // double a = 1/6;
       // 1     0.166666666667
       //0.16666666666
       //0.16666666666666666666666666666667
       return DecimalUtils.round(Math.pow((x + 1) ,0.16666666666666666666666666666667), 5) ;
       //2    return Math.pow(5 * x - 6,0.5);
      //3 return Math.pow(3*x + 2, 0.5);
    }
}
