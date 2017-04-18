/**
 * Created by Igor on 4/18/2017.
 */
public class Runner {

    public static void main(String[] args){

        Button simpleButton = new Button(new ButtonClickHandler());

        //-------------------------------------------
        /*
        Вместо того, чтобы создавать отдельные классы, реализующие интерфейс EventHandler,
        здесь обработчики задаются в виде анонимных объектов, которые реализуют интерфейс EventHandler.
         */
        Button tvButton = new Button(new EventHandler(){

            private boolean on = false;
            public void execute(){

                if(on) {
                    System.out.println("Телевизор выключен..");
                    on=false;
                }
                else {
                    System.out.println("Телевизор включен!");
                    on=true;
                }
            }
        });

        //-------------------------------------------

        Button printButton = new Button(new EventHandler(){

            public void execute(){

                System.out.println("Запущена печать на принтере...");
            }
        });

        //-------------------------------------------

        tvButton.click();
        printButton.click();
        tvButton.click();
        simpleButton.click();

    }
}
