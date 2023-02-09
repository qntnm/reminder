import java.util.Timer;
public class reminder{
    String title;
    String desc;
    Boolean isComplete;
    double duration;
    double snooze;
    double streak;
    Timer time;
    progress progress;
    double id;

    public reminder(double id, String title,String desc, Boolean isComplete, double duration, double snooze, double streak, Timer time, progress progress){
        this.title = title;
        this.desc = desc;
        this.isComplete = isComplete;
        this.duration = duration;
        this.streak = streak;
        this.snooze = snooze;
        this.time = time;
        this.progress = progress;
        
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
     *  @param a title (stroing) to set to the reminder
     */
    public void setTitle(String p_title){
        title = p_title;
    }

    /**
     * @param description (string) of the reminder 
     */
    public void setDescription(String p_description){
        desc = p_description;
    }
    /**
     * @param  bolean if Reminder iscomplete
     */
    public void setIsComplete(boolean p_isComplete){
        isComplete = p_isComplete;
    }
    /**
     * @param duration of the timer (mintues)
     */
    public void setDuration(double p_duration){
        duration = mintuestoMiliseconds(duration);
    }
    /**
     * @return mintues to miliseconds
     */
    public double mintuestoMiliseconds(double miliseconds){
        return 0.0;
    }
    // Snooze and streak

    /**
     * @param amount of times snooze this reminder (resets per day)
     */
    public void setSnooze(double p_snooze){
        snooze = p_snooze;
    }
    /**
     * @param set streak this is snooze that counts per day
     */
    public void setStreak(double p_streak){
        streak = p_streak;
    }

    




 





}