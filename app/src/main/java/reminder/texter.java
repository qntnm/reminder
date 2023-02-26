package reminder;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class texter {
    // Twilio Account Info (Private concel in some way)
    public static final String ACCOUNT_SID = "ACfb4ac3846954f242eeb830d0a2cbc391";
    public static final String AUTH_TOKEN = "d0d7e543bbc6deb5cc1b4a90b641bb37";
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
    public void sendText() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new PhoneNumber("+16024913461"), new PhoneNumber(TWILIO_PHONE_NUMBER), text).create();
            
        setTextSent(true);
    }
    

}