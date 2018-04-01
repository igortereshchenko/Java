package LessonInterface;

/**
 * Created by student on 19.03.2018.
 */
public class Button {

    IEventHandler action;

    public Button(IEventHandler action){
        this.action=action;
    }

    public void Click(){

        action.execute();
    }
}
