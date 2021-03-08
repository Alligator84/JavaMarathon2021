package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<User> subscriptions;

    public User(String name) {
        this.name = name;
        subscriptions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        boolean sub = false;
        for (User element : subscriptions) {
            if (element.equals(user)) {
                sub = true;
                continue;
            }
        }
        return sub;
    }

    public boolean isFriend(User user) {
        boolean friend = false;
        if (user.isSubscribed(this) && this.isSubscribed(user)) {
            friend = true;
        }
        return friend;
    }

    public void sendMessage(User user1, String text) {
        MessageDatabase.addNewMessage(this, user1, text);
    }

    public String toString() {
        return name;
    }
}
