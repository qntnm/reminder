package reminder;
import java.util.Scanner;

public class welcome {
    public welcome(){}
    public static void welcomeScreen(){
        Scanner scan = new Scanner(System.in);
        String name = "";
        String phoneNumber = "";
        util.Logo();
        System.out.println("Weclome to remidner,What is your name?");
        name = scan.nextLine();
        System.out.println("What is your phone number? (format: +16021234567)");
        phoneNumber = scan.nextLine();
        user.init(name,phoneNumber);
        System.out.println("Thank you for joining " + user.getName());
        System.out.println("Please press enter");
      
    }
}
