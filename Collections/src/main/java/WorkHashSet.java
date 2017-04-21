import java.util.HashSet;

/**
 * Created by Igor on 4/21/2017.
 */
public class WorkHashSet {

    public static  void HashSet(){
        System.out.println("\n\nWorking with HashSet");

        HashSet<String> states = new HashSet<String>();

        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");

        System.out.printf("В списке %d элементов \n", states.size());

        for(String state : states){

            System.out.println(state);
        }

        // проверка на наличие элемента в списке
        if(states.contains("Франция")){

            System.out.println("Список содержит государство Франция");
        }
        states.remove("Германия");
    }
}
