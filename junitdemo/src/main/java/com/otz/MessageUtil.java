package com.otz;

public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    // prints the message
    public String printMessage() {
        System.out.println(message);
        return message;
    }

    public void setMessage(String message){ this.message=message;}
    public String getMessage(){ return this.message;}
}
