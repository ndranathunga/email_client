// 200517U

//import libraries

import RecipientFactory.Recipient;
import RecipientFactory.RecipientFactory;
import RecipientIterator.IRecipientCollection;
import RecipientIterator.IRecipientIterator;
import RecipientIterator.RecipientCollection;

import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Email_Client {
    private static int recipientCount = 0;

    public static void main(String[] args) throws IOException {
        // Create new recipient collection
        IRecipientCollection rc = new RecipientCollection();

        // Read the recipient list file and add each recipient to the collection
        File file = new File("clientList.txt");

        if (!file.createNewFile()) {
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String contactDetail = fileReader.nextLine();
                Recipient temp = createRecipient(contactDetail);
                rc.add(temp);
                recipientCount += 1;
            }
        }
        // Create an iterator to the collection
        IRecipientIterator ri = rc.createIterator();

        // Store birthdays on a hashmap for easy access
        HashMap<String, LinkedList<Recipient>> birthdayHashMap = birthdays(ri);

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Enter option type:\s
                1 - Adding a new recipient
                2 - Sending an email
                3 - Printing out all the recipients who have birthdays
                4 - Printing out details of all the emails sent
                5 - Printing out the number of recipient objects in the application""");

        int option = scanner.nextInt();

        switch(option){
            case 1:
                // input format - Official: nimal,nimal@gmail.com,ceo
                // Use a single input to get all the details of a recipient
                // code to add a new recipient
                // store details in clientList.txt file
                // Hint: use methods for reading and writing files
                break;
            case 2:
                // input format - email, subject, content
                // code to send an email
                break;
            case 3:
                // input format - yyyy/MM/dd (ex: 2018/09/17)
                // code to print recipients who have birthdays on the given date
                break;
            case 4:
                // input format - yyyy/MM/dd (ex: 2018/09/17)
                // code to print the details of all the emails sent on the input date
                break;
            case 5:
                // code to print the number of recipient objects in the application
                break;

        }

        // start email client
        // code to create objects for each recipient in clientList.txt
        // use necessary variables, methods and classes

    }

    public static Recipient createRecipient(String details) {
        String temp;
        String[] detailsArray;
        String recipientType;

        if (details.startsWith("Official")) {
            recipientType = "Official";
        } else if (details.startsWith("Personal")) {
            recipientType = "Personal";
        } else if (details.startsWith("Office_friend")) {
            recipientType = "Office_friend";
        } else {
            throw new InvalidParameterException("Invalid recipient type.");
        }
        temp = details.substring(recipientType.length() + 2, details.length()).strip();
        detailsArray = temp.split(",", 0);

        RecipientFactory rf = new RecipientFactory();
        Recipient newRecipient;

        switch (recipientType) {
            case "Personal" -> newRecipient = rf.createRecipient("P", detailsArray[0], detailsArray[2], detailsArray[1], detailsArray[3]);
            case "Official" -> newRecipient = rf.createRecipient("O", detailsArray[0], detailsArray[1], detailsArray[2]);
            case "Office_friend" -> newRecipient = rf.createRecipient("OF", detailsArray[0], detailsArray[1], detailsArray[2], detailsArray[3]);
            default -> throw new InvalidParameterException("Invalid case");
        }
        return newRecipient;
    }

    public static HashMap<String, LinkedList<Recipient>> birthdays(IRecipientIterator recipientIterator) {
        HashMap<String, LinkedList<Recipient>> birthdayRecipients = new HashMap<>();

        while (recipientIterator.hasNext()) {
            Recipient tempRecipient = recipientIterator.current();
            String bd = tempRecipient.getBirthday();

            if (bd != null) {
                LinkedList<Recipient> tempList;

                if (birthdayRecipients.containsKey(bd)) {
                    tempList = birthdayRecipients.get(bd);
                } else {
                    tempList = new LinkedList<>();
                }
                tempList.add(tempRecipient);
                birthdayRecipients.put(bd, tempList);
            }
            recipientIterator.next();
        }
        return birthdayRecipients;
    }
}

// create more classes needed for the implementation (remove the  public access modifier from classes when you submit your code)