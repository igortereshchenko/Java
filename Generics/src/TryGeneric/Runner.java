package TryGeneric;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {


	    //---------------------------------
		//Generics
		BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(10)); 
	    System.out.println(value1.getValue());
	    

	    
	    BoxPrinter<String> value2 = new BoxPrinter<String>("Hello world"); 
	    System.out.println(value2.getValue()); 


	    //---------------------------------
	    
	    BoxPrinter2<Integer, String> pair = new BoxPrinter2<Integer, String>(6," Apr");
	    
	    System.out.println(pair.getFirst() + pair.getSecond());
	    

	    //---------------------------------
	    //Diamond syntax
	    
	    BoxPrinter2<Integer, String> pair2 = new BoxPrinter2(7," May");
	    
	    System.out.println(pair2.getFirst() + pair2.getSecond());
	    
	    

	    //---------------------------------
	    //Generic methods
	    
	    List<Integer> intList = new ArrayList<Integer>(); 
        intList.add(1); 
        intList.add(2); 
        System.out.println("Список до обработки дженерик-методом: " + intList);
        
        Library.fill(intList, 0); 
        
        System.out.println("Список после обработки дженерик-методом: " 
                + intList); 
	    
        
        //---------------------------------
        //Wildcards
        
        //List<Number> intList = new ArrayList<Integer>();
        
    
    
        List<Integer> list = new ArrayList<>(); 
        list.add(10); 
        list.add(100);
        
        Wildcards.printList(list); 
        
        List<String> strList = new ArrayList<>(); 
        strList.add("10"); 
        strList.add("100");
        
        Wildcards.printList(Wildcards.printListbracket(strList)); 
        
        
        List<?> intListmask = new ArrayList<Integer>();
        //intListmask.add(1);
        
        //Bounded Type Parameters
        
        List<?> numList = new ArrayList<Integer>(); 
        numList = new ArrayList<String>();  			//BAD CODE!!!! 
        
        
        List<? extends  Number> numList_professional = new ArrayList<Integer>(); 
        numList_professional = new ArrayList<Double>(); 
        
        numList_professional = new ArrayList<Float>();
        
        
        //numList_professional = new ArrayList<String>();
        
        //numList_professional.add(1.1);
        
        System.out.println(Library.sum(list));
	    
	}

}
