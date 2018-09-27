public class Message {
    private String recipiant;
    private String sender;
    private String message;

    public Message(){
        this.recipiant = "No Recipiant";
        this.sender = "No Sender";
        this.message = "No Message";
    }

    public Message(String recipiant, String sender, String message){
        this.recipiant = recipiant;
        this.sender = sender;
        this.message = message;
    }

    public String toString(){
        return ("From: " + sender + "\nTo: " + recipiant + "\n Message:\n" + message);
    }

    public void setRecipiant(String recipiant){
        this.recipiant = recipiant;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public void setMessage(String sender){
        this.sender = sender;
    }

    public String getRecipiant(){
        return recipiant;
    }

    public String getSender(){
        return sender;
    }

    public String getMessage(){
        return message;
    }

    public void setRecipiantAndSender(String recipiant, String sender){
        this.recipiant = recipiant;
        this.sender = sender;
    }

    public void append(String msg){
        if (message.equals("No Message")){
            message = "";
        }
        message += ("\n" + msg);
    }
}
