import java.io.InputStream;
import java.util.Scanner;

public class Person extends Chatable {
    public Person(String name) {
        super(name);
    }

    @Override
    public void listen(Conversation conversation) {
        conversation.echo(System.out);
    }

    public Conversation talk(InputStream inputStream) {
        Scanner scanner = new Scanner(inputStream);

        System.out.printf("%s : ", this);

        return this.talk(scanner.nextLine().trim());
    }
}
