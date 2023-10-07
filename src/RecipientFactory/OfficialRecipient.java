package RecipientFactory;

public class OfficialRecipient extends Recipient {
    private final String position;

    public OfficialRecipient(String name, String email, String position) {
        super(name, email);
        this.position = position;
    }

    // Getters
    public String getPosition() {
        return position;
    }

    @Override
    public String getBirthday() {
        return null;
    }
}
