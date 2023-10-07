package RecipientFactory;

public class PersonalRecipient extends Recipient {
    private final String nickname;
    private final String birthday;

    public PersonalRecipient(String name, String nickname, String email, String birthday) {
        super(name, email);
        this.nickname = nickname;
        this.birthday = birthday;
    }

    // Getters
    public String getNickname() {
        return nickname;
    }

    public String getBirthday() {
        return birthday;
    }
}
