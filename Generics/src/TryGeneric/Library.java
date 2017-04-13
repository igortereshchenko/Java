package TryGeneric;

import java.util.List;

public class Library {
	
	public static <T> void fill(List<T> list, T val) { 
        for (int i = 0; i < list.size(); i++) 
            list.set(i, val); 
    } 
	
	
	public static Double sum(List<? extends Number> numList) { 
	    Double result = 0.0; 
	    for (Number item : numList) { 
	        result += item.doubleValue(); 
	    } 
	    return result; 
	}

}
