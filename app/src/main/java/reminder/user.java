package reminder;

public class user {
    // Instance of user
    private static user single_instance = null;
    // Name Parameter
    private final String name;
    // PhoneNumber Parameter
    private final String phoneNumber;
    /**
     * Creates a new User
     * @param name
     * @param phoneNumber
     */
    private user(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    /**
     * retrieves the user instance given it is not null in which you have to initalize the user first
     * @return
     */
    public static user getInstance(){
        if(single_instance == null){
            throw new AssertionError("You have to call init first");
        }
        return single_instance;
    }
    /**
     * Initalizes the user and sets the parameters
     * @param p_name
     * @param p_phoneNumber
     * @return
     */
    public static user init(String p_name, String p_phoneNumber){
        if(single_instance != null){
            throw new AssertionError("Already Init");
        }
        single_instance = new user(p_name,p_phoneNumber);
        return single_instance;    
    }
    /** 
     * @return name of the user
     */
    public static String getName(){
        return single_instance.name;
    }
    /**
     * @return phonenumber of user
     */
    public static String getPhoneNumber(){
        return single_instance.phoneNumber;
    }
}
