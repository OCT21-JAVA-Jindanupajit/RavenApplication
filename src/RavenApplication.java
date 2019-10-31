import java.util.Scanner;

public class RavenApplication implements Runnable{


    public static void main(String[] args) {
        Thread t = new Thread(new RavenApplication());
        t.start();
    }


    @Override
    public void run() {

        Person you = new Person ("Dave Wolf");
        Robot raven = new Robot("Raven");
        EmotionEvaluator eliza = new EmotionEvaluator("Eliza");
        Logger alice = new Logger("Alice");

        you.listenTo(eliza);
        you.listenTo(raven);
        you.listenTo(alice);

        alice.talk("Hello, I am from billing department");
        alice.talk("I will count every line raven speak, and bill you");

        // eliza is an emotional therapist robot.
        eliza.listenTo(you);

        // alice is a robot from billing department, and will count raven conversation
        alice.listenTo(raven);

        eliza.talk("Hi!");

        eliza.talk("I will guide raven through this session");
        eliza.talk(String.format("%s just ignore me from now on!",you));
        raven.talk("Hello, how are you feeling today?");

        // now, you cannot see any conversation from eliza
        eliza.getListener().remove(you);

        // raven is a dumb bot, will repeat everything he heard.
        raven.listenTo(eliza);

        Conversation last;
        do {

            last = you.talk(System.in);


        } while(!last.getMessage().equalsIgnoreCase("q"));


        alice.talk("Hi!");
        Invoice invoice = new Invoice(100f,.35f);
        invoice.setCustomer(you);
        invoice.setTherapist(raven);
        invoice.setAddress(
                "12 S. Summit Ave\n" +
                "Gaithersburg, MD 20877");

        alice.talk("This is your invoice\n"+invoice.getInvoice(1,alice.getLog().size()));
        alice.talk("Thank you, bye!");



    }


}
