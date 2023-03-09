package reminder;
import java.util.UUID;

public class progress {
    String name;
    double completion;
    double current;
    UUID id;
    /**
    * Creates a progress
    * 
    */
    public progress() {
        this.completion = completion;
        this.current = current;
        id = UUID.randomUUID();
    }

    public void setProgress(String p_name, int p_completion){
        completion = p_completion;
    } 
    public double getProgessNumber(double current,double completion){
        double num3 = (current/completion);
        return num3 * 100;
    }  
    // given the completion and current values of a remidner, it outputs a string "progress bar" representation of the reminder's progress.
    public  String getProgress(double current,double completion){
        if(current !=0 && completion !=0){
        String xl= "x";
        String ol = "o";
        String array = "";
        String tempo = "";
        String tempx = "";
        for(int i = 0; i<current; i++){
            tempo += ol;
        }
        for(int j=0; j <(completion-current); j++){
            tempx += xl;
        }
        array = "[" + tempo +  (int) getProgessNumber(current,completion)+ "%" + tempx + "]";
        return array;
    }else{
        return "[0%]";
    }
        
    }


}