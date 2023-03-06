package reminder;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {

    public static void main(String[] args) throws InterruptedException {
    ArrayList<reminder> userArray = new ArrayList<reminder>();
     welcome.welcomeScreen();
     userArray = table.addReminders();
     table.tableScreen(userArray);
    
    }

    
    

}