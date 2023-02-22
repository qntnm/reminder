package reminder;


import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.time.LocalDate;
public class reminder{
    String title;
    Boolean isComplete;
    int duration;
    int snooze;
    int streak;
    Timer time;
    progress progressUser;
    UUID id;
    LocalDate now;
    int completion;
    texter twilio;
    /**
     * Creates a reminder
     * 
     * @param title of the remidner
     * @param isComplete if the reminder is complete (boolean)
     * @param duration of the reminder
     * @param snooze how many times they've completed the task (within the day)
     * @param streak how many times they've done the reminder (in days)
     */
    public reminder(String title, Boolean isComplete, int duration, int snooze, int streak, int completion){
        this.title = title;
        this.isComplete = isComplete;
        this.duration = duration;
        this.streak = streak;
        this.snooze = snooze;
        this.completion = completion;                                               
        progressUser = new progress(this.snooze,this.completion);  
        time = new Timer();
        time.schedule(new textTask(), duration*60000);
        id = UUID.randomUUID();
        now = LocalDate.now(); 
        twilio = new texter(title);
        
   
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
    public LocalDate getDate(){
        return now;
    } 
    public String getProgess(){
        return progressUser.getProgress();
    }
    public void setDate(LocalDate p_date){
        now = p_date;
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
    public class textTask extends TimerTask {
        public void run() {
        if(!isComplete && snooze != 0){
            System.out.println("Timer up, text going through");
            
            time.cancel(); //Terminate the timer thread
        }

        }
    }

}