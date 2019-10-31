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
        Robot eliza = new Robot("Eliza");
        Logger alice = new Logger("Alice");

        you.listenTo(eliza);
        you.listenTo(raven);
        raven.listenTo(you);
        eliza.listenTo(raven);
        eliza.listenTo(you);

        alice.listenTo(raven);




        Conversation last;
        do {

            last = you.talk(System.in);


        } while(!last.getMessage().equalsIgnoreCase("q"));

        you.listenTo(alice);
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
