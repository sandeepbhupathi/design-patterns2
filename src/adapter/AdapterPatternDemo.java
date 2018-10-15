package adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        OrderPaymentImpl orderPayment = new OrderPaymentImpl();

        orderPayment.pay("bbyciti",1110);
        orderPayment.pay("Applepay",110);
        orderPayment.pay("amex",150);
    }
}
