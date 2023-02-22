package reminder.pages;
import java.util.Scanner;

import reminder.user;
import reminder.util;

public class welcome {
    public welcome(){}
    public static void welcomeScreen(){
        String name = "";
        String phoneNumber = "";
        Scanner scan = new Scanner(System.in);
        util.Logo();
        System.out.println("Weclome to remidner,What is your name?");
        name = scan.nextLine();
        System.out.println("What is your phone number? (format: +16021234567)");
        phoneNumber = scan.nextLine();
        user.init(name,phoneNumber);
        scan.close();
    }
}
