import java.util.Scanner;

public class RavenApplication implements Runnable{

    private MessageQueue log = new MessageQueue();

    public static void main(String[] args) {
        Thread t = new Thread(new RavenApplication());
        t.start();
    }


    @Override
    public void run() {


        do {

            log.append((new Conversation("you")).getConversation());

        } while(!log.last().getMessage().equalsIgnoreCase("q"));

    }


}
