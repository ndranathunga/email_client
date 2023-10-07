package RecipientIterator;

import RecipientFactory.Recipient;

import java.util.List;

public interface IRecipientCollection {
    void add(Recipient recipient);
    List<Recipient> getRecipients();
    IRecipientIterator createIterator();
}
