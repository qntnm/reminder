package reminder;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class texter {
    // Twilio Account Info (Private concel in some way)
    public static final String ACCOUNT_SID = "ACfb4ac3846954f242eeb830d0a2cbc391";
    public static final String AUTH_TOKEN = "092cc7abadb7df669f397d0f7bff3467";
    public static final String TWILIO_PHONE_NUMBER = "+18337380927";
    
    String text;
    boolean verifySent;

    /**
     * Creates a SendText
     * 
     * @param text        (mostly likely title of the reminder)
     */
    public texter(String text) {
        this.text = text;
        verifySent = false;
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
     * Sets the text message
     * 
     * @param p_textMessage
     */
    public void setTextMessage(String p_textMessage) {
        text = p_textMessage;
    }

    /**
     * checks if the text message was sent to the users phone (via sms using
     * twillio)
     * 
     * @return if the text was sent
     */
    public boolean textSent() {
        return verifySent;
    }
    public void setTextSent(boolean x){
        verifySent = x;
    }
    /**
     * Function that sends the text via creating a message throught the Twilio API
     */
    public void sendText() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new PhoneNumber(user.getPhoneNumber()), new PhoneNumber(TWILIO_PHONE_NUMBER),text).create();
            
        setTextSent(true);
    }
    

}