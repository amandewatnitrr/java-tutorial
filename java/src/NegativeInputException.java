public class NegativeInputException extends Exception{
    public NegativeInputException(){
        this("Input must be a positive integer.");
    }

    public NegativeInputException(String message){
        super(message);
    }
}
