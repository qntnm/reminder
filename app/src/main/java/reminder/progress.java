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
    * 
    */
    public progress(int completion, int current) {
        this.completion = completion;
        this.current = current;
        id = UUID.randomUUID();
    }

    public void setProgress(String p_name, int p_completion){
        completion = p_completion;
    } 
    public  double getProgessNumber(double num2, double num1){
        double num3 = (num2/num1) * 100;
        return num3;
    }  
    public  String getProgress(){
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
        array = "[" + tempo + (int) getProgessNumber(current,completion)+ "%" + tempx + "]";
        return array;
    }else{
        return "[0%]";
    }
        
    }


}