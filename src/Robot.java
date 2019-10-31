public class Robot extends Chatable implements AutoResponse {

    public Robot(String name) {
        super(name);
    }

    @Override
    public void listen(Conversation conversation) {
        Conversation response = new Conversation(this,this.autoResponse(conversation));
        talk(response.getMessage());
    }
}
