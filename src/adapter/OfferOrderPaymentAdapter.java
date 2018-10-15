package adapter;

public class OfferOrderPaymentAdapter implements OrderPayment {

    private  OfferOrderPayment offerOrderPayment;
    public OfferOrderPaymentAdapter(String paymentType){
        if(paymentType.equalsIgnoreCase("Applepay")){
            this.offerOrderPayment = new ApplePayOfferOrderPayment();
        }else if(paymentType.equalsIgnoreCase("bbyciti")){
            this.offerOrderPayment = new BBYCitiCardOfferOrderPayment();
        }
    }
    @Override
    public void pay(String paymentType,int amount) {
        if(paymentType.equalsIgnoreCase("Applepay")){
            this.offerOrderPayment.payApplePay(amount);
        }else if(paymentType.equalsIgnoreCase("bbyciti")){
            this.offerOrderPayment.payBBYCitiCreditCard(amount);
        }
    }
}
