package reminder;


import java.util.Timer;
import java.util.UUID;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class reminder{
    String title;
    Boolean isComplete;
    int duration;
    int snooze;
    int streak;
    Timer time;
    progress progress;
    UUID id;
    LocalDateTime now;
    int completion;

    /**
     * Creates a reminder
     * 
     * @param title of the remidner
     * @param isComplete if the reminder is complete (boolean)
     * @param duration of the reminder
     * @param snooze
     * @param streak
     * @param time
     * @param progress
     */
    public reminder(String title, Boolean isComplete, int duration, int snooze, int streak, int completion){
        this.title = title;
        this.isComplete = isComplete;
        this.duration = duration;
        this.streak = streak;
        this.snooze = snooze;
        this.completion = completion;
        progress = new progress(title,completion,snooze); // XXX make sure this works
        time = new Timer();
        id = UUID.randomUUID();
        now = LocalDateTime.now(); 
    
   
    }

    /**
     * @return the Title for the reminder
     */
    public String getTitle(){
       return title;
    }
    /** 
     * @return  if reminder is completed (used for if the reminder should put in the finished section) 
     * */
    public boolean getComplete(){
        return isComplete;
    }
    /**
     * @return The duration of the timer set by the user (e.g 1 hour to drink water)
     */
    public int getDuration(){
        return duration;
    }
    /**
     * @return the amount of times the task had been snoozed or completed (e.g drank water 2 twice by presseing snooze twice)
     */
    public int getSnooze(){
        return snooze;
    }
    /**
     * @return The streak in days, counter for how many times a task has been completed in days
     */
    public int getStreak(){
        return streak;
    }
    public LocalDateTime getDate(){
        return now;
    } 
    /**
     * Sets the title of the Reminder
     *  @param a title (stroing) to set to the reminder
     */
    public void setTitle(String p_title){
        title = p_title;
    }
    /**
     * Sets if the reminder is Complete
     * @param  bolean if Reminder iscomplete
     */
    public void setIsComplete(boolean p_isComplete){
        isComplete = p_isComplete;
    }
    /**
     * Sets the duration of the timer in mintues
     * @param duration of the timer (mintues)
     */
    public void setDuration(int p_duration){
        duration = mintuestoMiliseconds(duration);
    }
    /**
     * Converts miliseconds to mintues used in the duration method
     * @param mintues
     * @return miliseconds
     */
    public int mintuestoMiliseconds(int p_mintues){
        return 0;
    }
    // Snooze and streak

    /**
     * Sets the amount of times the user snoozes the Reminder
     * @param amount of times snooze this reminder (resets per day)
     */
    public void setSnooze(int p_snooze){
        snooze = p_snooze;
    }
    /**
     * Ses the amount of streaks (in days) the reminder has had
     * @param set streak this is snooze that counts per day
     */
    public void setStreak(int p_streak){
        streak = p_streak;
    }


}