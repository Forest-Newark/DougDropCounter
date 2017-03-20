import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by forestnewark on 3/20/17.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        //Instantiate CounterService and MenuService objects.
        CounterService cs = new CounterService();
        MenuService ms = new MenuService();
        cs.load();


        boolean run = true;


        //Instantiate Scanner object
        Scanner sc = new Scanner(System.in);

        //Print initial menu
        ms.welcomeMethod(cs.getDropCount());

        //Loop to control count
        while(run) {
            String input = sc.next();
            if (input.equals("d")) {
                cs.addDrop();
                ms.currentCount(cs.getDropCount());
            }

            else if(input.equals("log")) {
                System.out.println(cs.toString());
            }
            else if(input.equals("clearlog")) {
                cs.resetLog();

            }

            else if (input.equals("q")) {
                cs.save();
                quit();
            }
        }


    }

    public static void quit() {

        System.out.println("GoodBye");
        System.exit(0);
    }


}

