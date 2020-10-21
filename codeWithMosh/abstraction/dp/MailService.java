package abstraction.dp;

public class MailService {
    public void sendEmail(){
        connect(1);
        authenticate();
        //Send Email
        disconnect();

    }

    private void connect(int timeout){
        System.out.println("CONNECT");
    }

    private void disconnect(){
        System.out.println("DISCONNECT");
    }

    private void authenticate(){
        System.out.println("AUTHENTICATE");
    }
}
