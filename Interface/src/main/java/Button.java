/**
 * Created by Igor on 4/18/2017.
 */
public class Button {
    EventHandler handler;

    public Button(EventHandler action){

        this.handler=action;
    }
    public void click(){

        handler.execute();
    }
}
