package observer;

import java.util.ArrayList;
import java.util.List;

public class ProductUpdater {

    List<BaseProduct> baseProductList = new ArrayList<>();
    int productBasePrice;

    public void attach(BaseProduct storePrice) {
        baseProductList.add(storePrice);
    }

    public void setState(int productBasePrice){
        this.productBasePrice = productBasePrice;
        notifyAllProducts();
    }

    private void notifyAllProducts() {
        baseProductList.stream().forEach((eachProduct)->{
            eachProduct.update(productBasePrice);
        });
    }


}
