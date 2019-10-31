import java.util.ArrayList;

public abstract class Chatable {

    private final String name;
    private final ArrayList<Chatable> listener;


    public Chatable(String name) {
        this.name = name;
        this.listener = new ArrayList<Chatable>();

    }

    public Conversation talk(String message) {
        Conversation conversation = new Conversation(this, message);
        dispatchToListener(conversation);
        return conversation;
    }



    public String toString() {
        return this.getName();
    }

    public String getName() {
        return name;
    }


    public ArrayList<Chatable> getListener() {
        return listener;
    }

    public void listenTo(Chatable chatable) {
        if (chatable.getListener().contains((chatable)))
            return;
        chatable.getListener().add(this);
    }

    public abstract void listen(Conversation conversation);

    private void dispatchToListener(Conversation conversation) {
        for (Chatable chatable : this.listener) {
            chatable.listen(conversation);
        }
    }

}
