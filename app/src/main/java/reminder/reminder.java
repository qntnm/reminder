package reminder;

import java.util.Timer;
import java.util.UUID;
public class reminder{
    String title;
    String desc;
    Boolean isComplete;
    double duration;
    double snooze;
    double streak;
    Timer time;
    progress progress;
    UUID id;
    /**
     * Creates a reminder
     * 
     * @param title
     * @param desc
     * @param isComplete
     * @param duration
     * @param snooze
     * @param streak
     * @param time
     * @param progress
     */
    public reminder(String title,String desc, Boolean isComplete, double duration, double snooze, double streak, Timer time, progress progress){
        this.title = title;
        this.desc = desc;
        this.isComplete = isComplete;
        this.duration = duration;
        this.streak = streak;
        this.snooze = snooze;
        progress = new progress(title); // XXX make sure this works
        time = new Timer();
        id = UUID.randomUUID();
        
    }

    /**
     * @return the Title for the reminder
     */
    public String getTitle(){
       return title;
    }
    /**
     * @return  the description of the reminder (Empty if nothing)
     */
    public String getDescription(){
        return desc;

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
    public double getDuration(){
        return duration;
    }
    /**
     * @return the amount of times the task had been snoozed or completed (e.g drank water 2 twice by presseing snooze twice)
     */
    public double getSnooze(){
        return snooze;
    }
    /**
     * @return The streak in days, counter for how many times a task has been completed in days
     */
    public double getStreak(){
        return streak;
    }
    /**
     * Sets the title of the Reminder
     *  @param a title (stroing) to set to the reminder
     */
    public void setTitle(String p_title){
        title = p_title;
    }

    /**
     * Sets the Description of the title
     * @param description (string) of the reminder 
     */
    public void setDescription(String p_description){
        desc = p_description;
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
    public void setDuration(double p_duration){
        duration = mintuestoMiliseconds(duration);
    }
    /**
     * Converts miliseconds to mintues used in the duration method
     * @param mintues
     * @return miliseconds
     */
    public double mintuestoMiliseconds(double p_mintues){
        return 0.0;
    }
    // Snooze and streak

    /**
     * Sets the amount of times the user snoozes the Reminder
     * @param amount of times snooze this reminder (resets per day)
     */
    public void setSnooze(double p_snooze){
        snooze = p_snooze;
    }
    /**
     * Ses the amount of streaks (in days) the reminder has had
     * @param set streak this is snooze that counts per day
     */
    public void setStreak(double p_streak){
        streak = p_streak;
    }


}