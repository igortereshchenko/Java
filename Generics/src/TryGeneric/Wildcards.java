package TryGeneric;

import java.util.List;

public class Wildcards {
	
	 static void printList(List<?> list) { 
		 
	        for (Object item : list) 
	            System.out.println("{" + item + "}"); 
	    } 
	 
	 
	 static List<?> printListbracket(List<?> list) { 
		 
	        for (Object item : list) 
	            System.out.println("(" + item + ")"); 
	        
	        return list;
	    } 
}
