package LessonInterface;

/**
 * Created by student on 19.03.2018.
 */
public class CoolButtonClickHandler implements IEventHandler {

    public void execute() {
        System.out.println("CoolButtonEventHandler logic");
        System.out.println("Button pressed");
    }
}
