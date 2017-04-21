import java.util.*;

/**
 * Created by Igor on 4/21/2017.
 */
public class Runner {

    public static void main(String[] args){
        /*
Collection: базовый интерфейс для всех коллекций и других интерфейсов коллекций

Queue: наследует интерфейс Collection и представляет функционал для структур данных в виде очереди

Deque: наследует интерфейс Queue и представляет функционал для двунаправленных очередей

List: наследует интерфейс Collection и представляет функциональность простых списков

Set: также расширяет интерфейс Collection и используется для хранения множеств уникальных объектов

SortedSet: расширяет интерфейс Set для создания сортированных коллекций

NavigableSet: расширяет интерфейс SortedSet для создания коллекций, в которых можно осуществлять поиск по соответствию

Map: предназначен для созданий структур данных в виде словаря, где каждый элемент имеет определенный ключ и значение.
В отличие от других интерфейсов коллекций не наследуется от интерфейса Collection
         */

        WorkArrayList.ArrayList();

        WorkLinkedList.LinkedList();

        WorkHashSet.HashSet();

        WorkTreeSet.TreeSet();


        System.out.println("\n\nCompare with class defined comparator.....");

        TreeSet<Person> people = new TreeSet<Person>();
        people.add(new Person("Tom", 23));
        people.add(new Person("Nick",34));
        people.add(new Person("Tom",10));
        people.add(new Person("Bill",14));

        for(Person  p : people){

            System.out.println(p.getName() + " " + p.getAge());
        }

        System.out.println("\n\nCompare with user defined comparator.....");

        Comparator<Person> personcomparator = new PersonAgeComparator();
        TreeSet<Person> peopleByAge = new TreeSet(personcomparator);
        peopleByAge.add(new Person("Tom", 23));
        peopleByAge.add(new Person("Nick",34));
        peopleByAge.add(new Person("Tom",10));
        peopleByAge.add(new Person("Bill",14));

        for(Person  p : peopleByAge){

            System.out.println(p.getName() + " " + p.getAge());
        }

    }








}
