package singleresponsibility;

import java.util.List;

public class OrderBadExample {

    private List<OrderItem> items;

    private Payment payment;

    public void addItem(OrderItem item) { /* TODO document why this method is empty */ };

    public void setPayment(Payment payment) { /* TODO document why this method is empty */ };

    public void calculateTotal() { /* TODO document why this method is empty */ };

    public void placeOrder() { /* TODO document why this method is empty */ };

}
