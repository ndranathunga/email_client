package RecipientIterator;

import RecipientFactory.Recipient;

import java.util.ArrayList;
import java.util.List;

public class RecipientCollection implements IRecipientCollection {
    private List<Recipient> recipients = new ArrayList<>();

    @Override
    public void add(Recipient recipient) {
        recipients.add(recipient);
    }

    @Override
    public List<Recipient> getRecipients() {
        return recipients;
    }

    @Override
    public IRecipientIterator createIterator() {
    return new RecipientListIterator(this);
    }
}

class RecipientListIterator implements IRecipientIterator {
    private RecipientCollection collection;
    private int index;

    public RecipientListIterator(RecipientCollection collection) {
        this.collection = collection;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < this.collection.getRecipients().size();
    }

    @Override
    public Recipient current() {
        return this.collection.getRecipients().get(index);
    }

    @Override
    public void next() {
        index++;
    }

    @Override
    public void reset() {
        index = 0;
    }

    @Override
    public void update(Recipient recipient) {
        collection.add(recipient);
    }
}
