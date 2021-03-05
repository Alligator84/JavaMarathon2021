package day11.task1;

public class Picker {
    private int salary;
    private boolean isPayed;

    public Picker(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPayed(boolean payed) {
        this.isPayed = payed;
    }

    public int getSalary() {
        return this.salary;
    }

    public boolean getPayed() {
        return isPayed;
    }

    public String toString() {
        String str = "Заработная плата: " + this.salary + ", бонус выплачен: " + this.isPayed;
        return str;
    }
}
