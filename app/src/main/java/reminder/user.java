package reminder;

public class user {
    private static user single_instance = null;
    private final String name;
    private final String phoneNumber;

    private user(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public static user getInstance(){
        if(single_instance == null){
            throw new AssertionError("You have to call init first");
        }
        return single_instance;
    }

    public static user init(String p_name, String p_phoneNumber){
        if(single_instance != null){
            throw new AssertionError("Already Init");
        }
        single_instance = new user(p_name,p_phoneNumber);
        return single_instance;
         
    }
    public static String getName(){
        return single_instance.name;
    }
    public static String getPhoneNumber(){
        return single_instance.phoneNumber;
    }
}
