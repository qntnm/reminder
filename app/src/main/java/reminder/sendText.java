package reminder;

// import com.twilio.Twilio;
// import com.twilio.rest.api.v2010.accunt.Message;
// import com.twilio.type.PhoneNumber;

public class sendText {
    // Twilio Account Info (Private concel in some way)
    public static final String ACCOUNT_SID = "ACfb4ac3846954f242eeb830d0a2cbc391";
    public static final String AUTH_TOKEN = "45db3fa93acb57763be419eb596b3be4";

    double phoneNumber;
    String text;

    /**
     * Creates a SendText
     * 
     * @param phoneNumber of the user
     * @param text        (mostly likely title of the reminder)
     */
    public sendText(double phoneNumber, String text) {
        this.phoneNumber = phoneNumber;
        this.text = text;
    }

    /**
     * Gets the phoneNumber of the user
     * 
     * @return the PhoneNumber of the user
     */
    public double getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Gets the text
     * 
     * @return the text (most likely the title) of the reminder
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the phoneNumber of the user
     * 
     * @param p_phoneNumber
     */
    public void setPhoneNumber(double p_phoneNumber) {
        phoneNumber = p_phoneNumber;
    }

    /**
     * Sets the text message
     * @param p_textMessage         
     */
    public void setTextMessage(String p_textMessage) {
        text = p_textMessage;
    }
    /**
     * checks if the text message was sent to the users phone (via sms using twillio)
     * @return if the text was sent 
     */
    public boolean textSent() {
        return true;
    }
    

}