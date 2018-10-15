package adapter;

public class BBYCitiCardOfferOrderPayment implements OfferOrderPayment {
    @Override
    public void payApplePay(int amount) {

    }

    @Override
    public void payBBYCitiCreditCard(int amount) {
        System.out.println("Committing Order payment with BBY Citi Card for amount :"+amount);
    }
}
