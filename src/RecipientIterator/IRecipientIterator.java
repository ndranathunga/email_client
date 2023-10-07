package RecipientIterator;

import RecipientFactory.Recipient;

public interface IRecipientIterator {
    boolean hasNext();
    Recipient current();
    void next();
    void reset();
    void update(Recipient recipient);
}
