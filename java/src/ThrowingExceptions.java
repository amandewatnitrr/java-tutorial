public class ThrowingExceptions{
    public static double multiply(double a, double b) throws NegativeInputException{
        if(a>20)
            {
                throw new IllegalArgumentException("Parameter_1 must be greater than 20. Learn table upto 20.");
            }
        if(a<0 || b<0)
            {
                throw new NegativeInputException();
            }
        return a*b;
    }
}