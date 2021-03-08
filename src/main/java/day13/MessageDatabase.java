package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User sender, User receiver, String text) {
        Message msg = new Message(sender, receiver, text);
        messages.add(msg);
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User user1, User user2) {
        for (Message element : messages) {
            if ((element.getSender().equals(user1) && element.getReceiver().equals(user2)) || (element.getSender().equals(user2) && element.getReceiver().equals(user1))) {
                System.out.println(element.getSender() + ": " + element.getText());
            }
        }
    }
}
