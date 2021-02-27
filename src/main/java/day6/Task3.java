package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher marIvana = new Teacher("Мария Ивановна", "Биология");
        Student oleg = new Student("Oleg");
        marIvana.evaluate(oleg);
    }
}
