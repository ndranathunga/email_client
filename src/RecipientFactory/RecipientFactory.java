package RecipientFactory;

import java.util.Objects;
public class RecipientFactory {
    public Recipient createRecipient(String type, String name, String email, String position) {
        if (Objects.equals(type, "O")) {
            return new OfficialRecipient(name, email, position);
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }

    public Recipient createRecipient(String type, String name, String email, String positionOrNickname, String birthday) {
        if (Objects.equals(type, "OF")) {
            return new OfficialFriendRecipient(name, email, positionOrNickname, birthday);
        } else if (Objects.equals(type, "P")){
            return new PersonalRecipient(name, positionOrNickname, email, birthday);
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }
}
