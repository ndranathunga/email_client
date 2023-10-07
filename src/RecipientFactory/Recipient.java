package RecipientFactory;

public abstract class Recipient {
    private final String name;
    private final String email;

    public Recipient(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public abstract String getBirthday();
}
