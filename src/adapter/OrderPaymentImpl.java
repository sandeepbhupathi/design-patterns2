package adapter;

public class OrderPaymentImpl implements OrderPayment {
    OfferOrderPaymentAdapter offerOrderPaymentAdapter;
   /* public OrderPaymentImpl(String paymentType){
        this.offerOrderPaymentAdapter = new OfferOrderPaymentAdapter(paymentType);
    }*/
    @Override
    public void pay(String paymentType, int amount) {
            if(!paymentType.equalsIgnoreCase("bbyciti") && !paymentType.equalsIgnoreCase("Applepay")){
                System.out.println("Payment without offer channel for amount : "+amount);
            }else{
                offerOrderPaymentAdapter = new OfferOrderPaymentAdapter(paymentType);
                offerOrderPaymentAdapter.pay(paymentType,amount);
            }
    }
}
