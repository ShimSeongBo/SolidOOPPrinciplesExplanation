package singleresponsibility;

public class OrderGoodExample {

    private OrderItemManager orderItemManager;
    private PaymentService paymentService;

    public OrderGoodExample (OrderItemManager orderItemManager, PaymentService paymentService) {
        this.orderItemManager = orderItemManager;
        this.paymentService =  paymentService;
    }

    public void placeOrder() {
        orderItemManager.calculateTotal();
        paymentService.processPayment();
    }
}
