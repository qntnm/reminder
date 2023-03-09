package reminder;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) throws InterruptedException {
    ArrayList<reminder> userArray = new ArrayList<reminder>();
     welcome.welcomeScreen();
     userArray = table.addReminders();
     table.tableScreen(userArray,2);
    texter j = new texter("Drink water");
    j.sendText();
    
    }

    
    

}