/**
 * Created by Igor on 4/21/2017.
 */
public class Runner {

    public static void main(String[] args){

        System.out.println("\n-------------Method throws exception-----------------------");

        try{
            int result = getFactorial(-6);

            System.out.println(result);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        System.out.println("\n-------------Exception in method-----------------------");
        int result = getFactorialBadStyle(-6);

        System.out.println(result);



        System.out.println("\n-------------Class Exception-----------------------");
        try{
            int x = 6/0;
        }
        catch(Exception ex){

            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }


        System.out.println("\n-------------User defined exceptions----------------------");
        try{
            result = Factorial.getFactorial(-2);
            System.out.println(result);
        }
        catch(FactorialException ex){

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }

    }


    public static int getFactorial(int num) throws Exception{

        if(num<1) throw new Exception("Число не может быть меньше 1");
        int result=1;
        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }


    public static int getFactorialBadStyle(int num){

        int result=1;
        try{
            if(num<1) throw new Exception("Число не может быть меньше 1");

            for(int i=1; i<=num;i++){

                result*=i;
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
            result=num;
        }
        return result; //вернуть результат еобходимо в любом случае
    }
}
