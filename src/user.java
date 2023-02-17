import java.util.UUID;
public class user{
    UUID id;
    String name;
    String phoneNumber;
    public user(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
        id = UUID.randomUUID();
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String p_name){
        name = p_name;
    }
    public void setPhoneNumber(String p_phoneNumber){
        p_phoneNumber = name;
    }
    

}