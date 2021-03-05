package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return this.countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return this.countDeliveredOrders;
    }

    public String toString() {
        String str = "Количество собранных заказов: " + this.countPickedOrders + ", количество доставленных заказов: " + this.countDeliveredOrders;
        return str;
    }
}