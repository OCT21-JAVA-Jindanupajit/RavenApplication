import java.io.PrintStream;

public class Conversation {
    private Chatable chatable;
    private String message;

    public Conversation(Chatable chatable) {
        this.chatable = chatable;
        this.message = "";
    }

    public Conversation(Chatable chatable, String message) {
        this.chatable = chatable;
        this.message = message;
    }

    public Conversation echo(PrintStream printStream) {
        if (printStream != null)
        printStream.println(this);
        return this;
    }

    @Override
    public String toString() {
        return String.format("<%s> %s", this.chatable, this.message);
    }

    public Chatable getChatable() {
        return chatable;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
