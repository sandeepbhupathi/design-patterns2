package adapter;

public class ApplePayOfferOrderPayment implements OfferOrderPayment {
    @Override
    public void payApplePay(int amount) {
        System.out.println("Committing Order payment with Apple Pay for amount: "+amount);
    }

    @Override
    public void payBBYCitiCreditCard(int amount) {

    }
}
