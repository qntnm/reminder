package reminder;

import java.util.Scanner;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many reminders do you want?");
        // Amount of reminders they want (used in the for loop)
        double amount;
        amount = scan.nextDouble();
        scan.nextLine();
        // Array List of Progress Objects
        ArrayList<progress> arrayProgress = new ArrayList<progress>();

        // Loops for user inputted amount of times (How many reminders they want)
        // then creates an object with a name (user inputted) and adds it to the
        // arraylist
        for (int i = 0; i < amount; i++) {
            System.out.println("Name of the progress?");
            progress progress = new progress(scan.nextLine());
            arrayProgress.add(i, progress);
        }
        // Traveses the arraylist and prints the name that the user inputted of each
        // object in the arraylist.
        for (progress j : arrayProgress) {
            System.out.println(j.id + " " + j.name);
        }
        // Testing Logo in "ascii art"
        Logo();

        // Closes Scanner Object (needed for "Resource leak")
        scan.close();

        TableCreator(arrayProgress);

        System.out.println("\n" + getLengthArray(arrayProgress));
        // System.out.println("Jeff");
        // System.out.println(AutoIncrement("Jeff", " "));
        // System.out.println(AutoIncrement(" ", "-", false, true,
        // getLengthArray(arrayProgress)));

    }

    // Logo in some Nice looking font (might not work with some terminals )
    public static void Logo() {
        System.out.println("██████  ███████ ███    ███ ██ ███    ██ ██████  ███████ ██████");
        System.out.println("██  ██  ██      ████  ████ ██ ████   ██ ██   ██ ██      ██  ██");
        System.out.println("██████  █████   ██ ████ ██ ██ ██ ██  ██ ██   ██ █████   ██████");
        System.out.println("██   ██ ██      ██  ██  ██ ██ ██  ██ ██ ██   ██ ██      ██   ██");
        System.out.println("██   ██ ███████ ██      ██ ██ ██   ████ ██████  ███████ ██   ██");

    }

    public static void ReminderScreen() {

    }
    // Column Major CSV style table creator, 5 columns (for now) rows are dependent on how many reminders
    public static void TableCreator(ArrayList<progress> reminders) {
        // Iterates through every object
        for (int i = 0; i < reminders.size(); i++) {
            System.out.println("\n");
            System.out.println("+" + AutoIncrement("", "-", true, getLengthArray(reminders)) + "+");
        // Iterates through every name within every object and prints it
            for (int j = 0; j < 5; j++) {
                if (j % 5 == 0 || j == 0) {
                    // System.out.print("| " + reminders.get(i).name + " | ");
                    System.out.print("|" + AutoIncrement(reminders.get(i).name, " ", false, 0) + "|");
                } else {
                    // System.out.print(" " + reminders.get(i).name + " | ");
                    System.out.print(AutoIncrement(reminders.get(i).name, " ", false, 0) + "|");
                }

            }
        }
    }
    // Increments the dashes in the row delimeter by x amount or increments the spaces adds 3 spaces infront and behind a word 
    public static String AutoIncrement(String input, String value, boolean column, int length) {
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
    public static int getLengthArray(ArrayList<progress> reminders) {
        int length = 0;
        for (int i = 0; i < reminders.size(); i++) {
            length += reminders.get(i).name.length();
        }
        return (length * 5) + 34;
    }

}