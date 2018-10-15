package builder;

public class ProductBuilderDemo {
    public static void main(String[] args) {
        Product product = new ProductBuilder().deliveryType("expediated").finance(true).insuranceType("basic").isSmartTv(true).size(40).screenType("LED").build();

        System.out.println(product);
    }

}
