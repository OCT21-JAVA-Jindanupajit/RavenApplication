public interface AutoResponse {

    default String autoResponse(Conversation conversation) {
        switch(conversation.getMessage().toLowerCase()) {
            case "q":
                return autoGoodbye(conversation);

            default:
                return defaultResponse(conversation);
        }
    }

    default String autoGoodbye(Conversation conversation) {
        return String.format("Goodbye",conversation.getChatable().getName());
    }

    default String defaultResponse(Conversation conversation) {
        return String.format("I heard %s said \"%s\"", conversation.getChatable(), conversation.getMessage());
    }

}
