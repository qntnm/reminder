package reminder;

import java.util.ArrayList;

public class util {
    public util(){

    }
     // Logo in some Nice looking font (might not work with some terminals )
     public void Logo() {
        System.out.println("██████  ███████ ███    ███ ██ ███    ██ ██████  ███████ ██████");
        System.out.println("██  ██  ██      ████  ████ ██ ████   ██ ██   ██ ██      ██  ██");
        System.out.println("██████  █████   ██ ████ ██ ██ ██ ██  ██ ██   ██ █████   ██████");
        System.out.println("██   ██ ██      ██  ██  ██ ██ ██  ██ ██ ██   ██ ██      ██   ██");
        System.out.println("██   ██ ███████ ██      ██ ██ ██   ████ ██████  ███████ ██   ██");

    }

    public void ReminderScreen() {

    }
    // Column Major CSV style table creator, 5 columns (for now) rows are dependent on how many reminders
    public void TableCreator(ArrayList<reminder> reminders) {
        // Iterates through every object
        
        
        for (int i = 0; i < reminders.size(); i++) {
            System.out.println("\n");
            System.out.println("+" + AutoIncrement("", "-", true, getLengthArray(reminders,i)) + "+");
        // Iterates through every name within every object and prints it
            for (int j = 0; j < 5; j++) {
                if (j % 5 == 0 || j == 0) {
                    // System.out.print("| " + reminders.get(i).name + " | ");
                    System.out.print("|" + AutoIncrement(reminders.get(i).title, " ", false,     0) + "|");
                } else {
                    // System.out.print(" " + reminders.get(i).name + " | ");
                    System.out.print(AutoIncrement(reminders.get(i).title, " ", false, 0) + "|");
                }

            }
        }
    }
    // Increments the dashes in the row delimeter by x amount or increments the spaces adds 3 spaces infront and behind a word 
    public  String AutoIncrement(String input, String value, boolean column, int length) {
        String output1 = "";
        String output2 = "";
        String dash1 = "";

        if (!column) {
            for (int i = 0; i < 6; i++) {
                if (i % 2 == 0) {
                    output1 += value;
                } else {
                    output2 += value;
                }
            }
        } else {
            for (int j = 0; j <= length; j++) {
                dash1 += value;
            }
        }

        String output = output1 + input + output2;
        String dash = dash1;
        if (!column) {
            return output;
        } else
            return dash;

    }
    // Traverses through an arraylist and adds the length of each name within each object
    public  int getLengthArray(ArrayList<reminder> reminders, int object) {
        int length = 0;
        
        length += (reminders.get(object).title.length()) + booleanToString(reminders.get(object).isComplete).length() + intToString(reminders.get(object).duration).length() + intToString(reminders.get(object).snooze).length() + intToString(reminders.get(object).streak).length() + intToString(reminders.get(object).streak).length(); 
        //return (length * 5) + 34;
        return length;
    }
    public  String booleanToString(boolean x){
        String temp = String.valueOf(x);
        return temp;
        
    }
    public String intToString(int x){
        Integer temp = new Integer(x);
        return String.valueOf(temp);
    }
    
}
