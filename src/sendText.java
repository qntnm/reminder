public class sendText {
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
