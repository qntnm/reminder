package reminder;

import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class util {
    LocalDate date = LocalDate.now();
    texter twilio;

    public util() {

    }

    // Logo in some Nice looking font (might not work with some terminals )
    public static void Logo() {
        System.out.println("██████  ███████ ███    ███ ██ ███    ██ ██████  ███████ ██████");
        System.out.println("██  ██  ██      ████  ████ ██ ████   ██ ██   ██ ██      ██  ██");
        System.out.println("██████  █████   ██ ████ ██ ██ ██ ██  ██ ██   ██ █████   ██████");
        System.out.println("██   ██ ██      ██  ██  ██ ██ ██  ██ ██ ██   ██ ██      ██   ██");
        System.out.println("██   ██ ███████ ██      ██ ██ ██   ████ ██████  ███████ ██   ██");

    }

    // Column Major CSV style table creator, 5 columns (for now) rows are dependent on how many reminders
    public static void TableCreator(ArrayList<reminder> reminders) {
        // Iterates through every object
        System.out.println("     Name " + "\t" + " Time  " + "  " + "  date  " + " " + "  complete " + "   " + " snooze ");
        for (int i = 0; i < reminders.size(); i++) {
            System.out.println("+" + AutoIncrement("", "-", true, getLengthArray(reminders,i)) + "+");
        // Iterates through every name within every object and prints it
            for (int j = 0; j < 5; j++) {
                // Title Case
                if (j == 0) {
                    System.out.print("|" + AutoIncrement(reminders.get(i).title, " ", false,     0) + "|");
                // Duration Case
                } else if( j == 1) {
                    System.out.print(AutoIncrement(intToString(reminders.get(i).getDuration()), " ", false, 0) + "|");
                // Date Case
                } else if(j == 2){
                    System.out.print(AutoIncrement(dateToString(reminders.get(i).getDate()), " ", false, 0) + "|");
                // Complete Case
                }else if(j==3){
                    System.out.print(AutoIncrement(booleanToString(reminders.get(i).getComplete()), " ", false, 0) + "|");
                // Snooze case (since its last the progress also is outputed)
                }else {
                    System.out.print(AutoIncrement(intToString(reminders.get(i).getSnooze()), " ", false, 0) + "|");
                    System.out.println( "\n" + reminders.get(i).getProgess());
                }

            }
        }
    }

    // Increments the dashes in the row delimeter by x amount or increments the
    // spaces adds 3 spaces infront and behind a word
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

    // Traverses through an arraylist and adds the length of each name within each
    // object
    public static int getLengthArray(ArrayList<reminder> reminders, int index) {
        int length = 0;

        length += (reminders.get(index).getTitle().length() + intToString(reminders.get(index).getDuration()).length() + intToString(reminders.get(index).completion).length() + booleanToString(reminders.get(index).getComplete()).length() + dateToString(reminders.get(index).getDate()).length());
        //return (length * 5) + 34;
        return length + 34;
    }
    @Deprecated
    public static String spaceOut(int j,String k,reminder l){
        String spaced = "";
        // title
        if(j==1){
            spaced = AutoIncrement(k," " , true,(l.title).length());
            return spaced;
        // duration
        }else if(j==2){
            spaced = AutoIncrement(k, " ", false,intToString(l.duration).length());
            return spaced;
        // date
        }else if(j==3){
            spaced = AutoIncrement(k, " ", false, dateToString(l.getDate()).length());
            return spaced;
        // completion
        }else if(j==4){
            spaced = AutoIncrement(k, " ", false,intToString(l.completion).length());
            return spaced;
        // complete
        }else if (j==5){
             spaced = AutoIncrement(k, " ", false, booleanToString(l.getComplete()).length());
             return spaced;
        }else {
            return "if/else statment not working ";
        }
        
    }
    public static String booleanToString(boolean x) {
        String temp = String.valueOf(x);
        return temp;

    }

    public static String intToString(int x) {
        Integer temp = new Integer(x);
        return String.valueOf(temp);
    }

    public static String dateToString(LocalDate date) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String j = date.format(dateFormat);
        return j;
    }

    public boolean streakCounter(reminder x) {
        if (date.isAfter(x.getDate())) {
            x.setStreak(x.getStreak() + 1);
            x.setDate(date);
        }
        return false;
    }

}
