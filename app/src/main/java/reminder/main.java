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
        // Closes Scanner Object (needed for "Resource leak")
        scan.close();

    }
}