import java.util.Scanner;

public class Conversation {
    private String person;
    private String message;

    public Conversation(String person) {
        this.person = person;
        this.message = "";
    }

    public Conversation(String person, String message) {
        this.person = person;
        this.message = message;
    }

    public Conversation getConversation() {
        Scanner kb = new Scanner(System.in);

        System.out.printf("%s : ", this.person);
        this.message = kb.nextLine().trim();
        return this;
    }

    @Override
    public String toString() {
        return String.format("<%s> %s", this.person, this.message);
    }
    public String getPerson() {
        return person;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
