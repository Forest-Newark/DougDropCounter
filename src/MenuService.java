/**
 * Created by forestnewark on 3/20/17.
 */
public class MenuService {


    public void welcomeMethod(int dropCount) {
        System.out.println();
        System.out.println("              Welcome to the Doug Drop Counter (DDC)");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("                ** Current Drop Count: " + dropCount + " **" );
        System.out.println("----------------------------------------------------------------------");
        System.out.println("        \"d\" - add drop         || \"log\" - list drops" );
        System.out.println();
        System.out.println("        \"clearlog\" - clear log || \"q\" - quit and save");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
    }

    public void currentCount(int count) {
        System.out.printf("Doug's Current Drop Count is : %s \n",count);

    }
}
