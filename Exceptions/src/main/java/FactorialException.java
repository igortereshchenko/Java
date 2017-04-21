/**
 * Created by Igor on 4/21/2017.
 */
class FactorialException extends Exception{

    private int number;

    public int getNumber(){return number;}

    public FactorialException(String message, int num){

        super(message);
        number=num;
    }
}