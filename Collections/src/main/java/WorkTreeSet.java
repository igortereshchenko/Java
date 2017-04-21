import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Igor on 4/21/2017.
 */
public class WorkTreeSet {

    public static  void TreeSet(){
        System.out.println("\n\nWorking with TreeSet");

        TreeSet<String> states = new TreeSet<String>();

        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Италия");
        states.add("Великобритания");

        System.out.printf("В списке %d элементов \n", states.size());


        for(String state : states){

            System.out.println(state);
        }


        System.out.println(states.first()); // получим первый - самый меньший элемент
        System.out.println(states.last()); // получим последний - самый больший элемент
        // получим поднабор от одного элемента до другого

        SortedSet<String> set = states.subSet("Германия", "Франция");
        System.out.println(set);
        // элемент из набора, который больше текущего
        String greater = states.higher("Германия");
        System.out.println(greater);

        // элемент из набора, который больше текущего
        String lower = states.lower("Германия");
        System.out.println(lower);

        // возвращаем набор в обратном порядке
        NavigableSet<String> navSet = states.descendingSet();
        System.out.println(navSet);

        // возвращаем набор в котором все элементы меньше текущего
        SortedSet<String> setLower=states.headSet("Германия");
        System.out.println(setLower);

        // возвращаем набор в котором все элементы больше текущего
        SortedSet<String> setGreater=states.tailSet("Германия");
        System.out.println(setGreater);

    }
}
