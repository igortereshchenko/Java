package LessonInterface;



/**
 * Created by student on 19.03.2018.
 */
public class Runner {
    public static void main(String[] arg){

        Button button = new Button(new ButtonClickHandler());

        Button coolButton = new Button(new CoolButtonClickHandler());

        System.out.println("ButtonClickHandler and CoolButtonClickHandler");
        button.Click();
        coolButton.Click();

        System.out.println("\n\nanomimus IEventHandler");
        Button anomimusButton = new Button(new IEventHandler() {

            public void execute() {
                System.out.println("Anonymus button pressed");
            }
        });

        anomimusButton.Click();


        System.out.println("\n\nanomimus IEventHandler with fields");

        Button tvButton = new Button(new IEventHandler() {

            boolean on = false;

            public void execute() {
                if (on){
                    System.out.println("TV turn OFF");

                    on=false;
                }else{
                    System.out.println("TV turn ON");

                    on=true;
                }

            }
        });

        tvButton.Click();
        tvButton.Click();
        tvButton.Click();
        tvButton.Click();
        tvButton.Click();

    }
}

