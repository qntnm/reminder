package reminder;
import reminder.util;
import java.util.UUID;

public class progress {
    String name;
    int completion;
    int current;
    UUID id;
    /**
    * Creates a progress
    * @param name of the progress
    */
    public progress(String name, int completion, int current) {
        this.name = name;
        this.completion = completion;
        this.current = current;
        id = UUID.randomUUID();
    }

    public void setProgress(String p_name, int p_completion){
        name = p_name;
        completion = p_completion;
    } 
    public static double getProgessNumber(double num2, double num1){
        double num3 = (num2/num1) * 100;
        return num3;
    }  
    public static String getProgress(int p_current, int p_completion, String x){
        String xl= "x";
        String ol = "o";
        String array = "";
        String tempo = "";
        String tempx = "";
        for(int i = 0; i<p_current; i++){
            tempo += ol;
        }
        for(int j=0; j <(p_completion-p_current); j++){
            tempx += xl;
        }
        array = "[" + tempo + (int) getProgessNumber(5,10)+ "%" + tempx + "]";
        return array;
        
    }


}