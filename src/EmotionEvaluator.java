public class EmotionEvaluator extends Robot {

    private String [ ] positive = {"good", "glad", "happy", "relaxed", "accomplished", "alert", "creative"};

    private String [ ] negative = {"bad", "sad", "tired", "angry", "anxious", "hungry", "moody", "afraid"};

    public EmotionEvaluator(String name) {
        super(name);
    }


    @Override
    public String autoResponse(Conversation conversation) {
        String message = conversation.getMessage().toLowerCase();
        int positiveCounter = 0;
        int negativeCounter = 0;

        for (String token : positive) {
           if (message.contains(token))
               ++positiveCounter;
        }
        for (String token : negative) {
            if (message.contains(token))
                ++negativeCounter;
        }

        if (positiveCounter == negativeCounter) {
            return "Meh.";
        }
        else if (positiveCounter > negativeCounter) {
            return "I am so happy for you...Yay...";
        }
        else /* if (positiveCounter < negativeCounter) */ {
            return "Really! Why, tell me more!";
        }

    }
}
