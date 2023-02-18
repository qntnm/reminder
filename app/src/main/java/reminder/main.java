package reminder;
import reminder.util;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        // initalize Util Class
        util utility = new util();
        // Parameters for a reminder object (Scanner)
        String title = "";
        boolean isComplete = false;
        int duration = 0;
        int snooze = 0;
        int streak = 0;
        int completion = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many reminders do you want?");
        // Amount of reminders they want (used in the for loop)
        int amount;
        amount = scan.nextInt();
        scan.nextLine();
        // Array List of Progress Objects
        ArrayList<reminder> arrayReminders = new ArrayList<reminder>();

        // Loops for user inputted amount of times (How many reminders they want)
        // then creates an object with a name (user inputted) and adds it to the
        // arraylist
        for (int i = 0; i < amount; i++) {
            System.out.println("Title of the Reminder?");
            title = scan.nextLine();
            System.out.println("How long should the timer be? (in mintues, 60 minues in a hour)");
            duration = scan.nextInt();
            scan.nextLine();
            System.out.println("How many times do you want to get reminded");
            completion = scan.nextInt();

            reminder userReminders = new reminder(title,isComplete,duration,snooze,streak,completion);
            arrayReminders.add(i, userReminders);
        }
        // Traveses the arraylist and prints the name that the user inputted of each
        // object in the arraylist.
        for (reminder j : arrayReminders) {
            System.out.println(j.title + " , " + utility.intToString(j.duration) + " , " + j.snooze + " , " + j.streak);
        }
        
        
        // Closes Scanner Object (needed for "Resource leak")
        scan.close();

    
    }

    
    

}