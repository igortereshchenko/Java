import java.util.LinkedList;

/**
 * Created by Igor on 4/21/2017.
 */
public class WorkLinkedList {

    public static  void LinkedList(){
        System.out.println("\n\nWorking with LinkedList");

        LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("Германия"); // добавляем на последнее место
        states.add("Франция");  // добавляем на последнее место
        states.addLast("Великобритания"); // добавляем на последнее место
        states.addFirst("Испания"); // добавляем на первое место
        states.add(1, "Италия"); // добавляем элемент по индексу 1

        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Дания");
        for(String state : states){

            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(states.contains("Германия")){

            System.out.println("Список содержит государство Германия");
        }

        states.remove("Германия");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента
    }

}
