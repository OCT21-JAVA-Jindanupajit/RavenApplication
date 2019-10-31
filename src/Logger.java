public class Logger extends Robot {
    private final MessageQueue log = new MessageQueue();
    public Logger(String name) {
        super(name);
    }

    @Override
    public void listen(Conversation conversation) {
        log.append(conversation);
    }

    @Override
    public String autoGoodbye(Conversation conversation) {
        return null;
    }

    public void showLog() {
        for (Conversation conversation : log) {
            this.talk(String.format("I heard %s said \"%s\"",
                    conversation.getChatable().getName(),
                    conversation.getMessage()));
        }
    }

    public MessageQueue getLog() {
        return log;
    }
}
