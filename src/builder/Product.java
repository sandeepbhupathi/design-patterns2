package builder;

public class Product {
    int size;
    String screenType;

    @Override
    public String toString() {
        return "Product{" +
                "size=" + size +
                ", screenType='" + screenType + '\'' +
                ", productType='" + productType + '\'' +
                ", isSmartTv=" + isSmartTv +
                '}';
    }

    String productType;

    public Product(int size, String screenType, boolean isSmartTv,String productType) {
        this.size = size;
        this.screenType = screenType;
        this.isSmartTv = isSmartTv;
        this.productType=productType;
    }

    boolean isSmartTv;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (size != product.size) return false;
        if (isSmartTv != product.isSmartTv) return false;
        if (screenType != null ? !screenType.equals(product.screenType) : product.screenType != null) return false;
        return productType != null ? productType.equals(product.productType) : product.productType == null;
    }

   /* @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + (screenType != null ? screenType.hashCode() : 0);
        result = 31 * result + (productType != null ? productType.hashCode() : 0);
        result = 31 * result + (isSmartTv ? 1 : 0);
        return result;
    }*/
}
