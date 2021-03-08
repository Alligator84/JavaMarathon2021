package day13;

public class Task1 {
    public static void main(String[] args) {
        User oleg = new User("Oleg");
        User ivan = new User("Ivan");
        User kri = new User("Kristina");

        oleg.sendMessage(ivan, "Привет!");
        oleg.sendMessage(ivan, "Как дела?");

        ivan.sendMessage(oleg, "Привет...");
        ivan.sendMessage(oleg, "Всё ок");
        ivan.sendMessage(oleg, "Как сам?");

        kri.sendMessage(oleg, "Good day");
        kri.sendMessage(oleg, "How are you");
        kri.sendMessage(oleg, "I am...");

        oleg.sendMessage(kri, "Hi");
        oleg.sendMessage(kri, "So good");
        oleg.sendMessage(kri, "And you?");

        kri.sendMessage(oleg, "Bay!");

        MessageDatabase.showDialog(oleg, kri);




    }
}
