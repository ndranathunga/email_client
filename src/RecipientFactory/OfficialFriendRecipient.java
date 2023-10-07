package RecipientFactory;

public class OfficialFriendRecipient extends OfficialRecipient {
    private final String birthday;

    public OfficialFriendRecipient(String name, String email, String position, String birthday) {
        super(name, email, position);
        this.birthday = birthday;
    }

    // Getters
    public String getBirthday() {
        return birthday;
    }
}
