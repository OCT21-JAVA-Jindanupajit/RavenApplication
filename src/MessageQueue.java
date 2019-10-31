import java.util.ArrayList;

public class MessageQueue extends ArrayList<Conversation> {


    public String append(Conversation conversation) {
        this.add(conversation);
        return conversation.toString();
    }
    public String append(Person person, String message) {
        Conversation conversation = new Conversation(person,message);
        return this.append(conversation);

    }

    public Conversation peek() {
        if (this.isEmpty()) return null;

        return this.get(0);
    }

    public Conversation last() {
        if (this.isEmpty()) return null;
        return this.get(this.size()-1);
    }

    public Conversation poll() {
        if (this.isEmpty()) return null;

        return this.remove(0);
    }


}
