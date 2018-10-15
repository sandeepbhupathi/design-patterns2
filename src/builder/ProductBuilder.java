package builder;

public class ProductBuilder {
    boolean finance;
    int size;
    String screenType;
    boolean isSmartTv;
    String insuranceType;
    String deliveryTpe;

    public ProductBuilder finance(boolean finance){
        this.finance = finance;
        return this;
    }

    public ProductBuilder size(int size){
        this.size = size;
        return this;
    }

    public ProductBuilder isSmartTv(boolean isSmartTv){
        this.isSmartTv = isSmartTv;
        return this;
    }

    public ProductBuilder screenType(String screenType){
        this.screenType = screenType;
        return this;
    }

    public ProductBuilder insuranceType(String insuranceType){
        this.insuranceType = insuranceType;
        return this;
    }

    public ProductBuilder deliveryType(String deliveryTpe){
        this.deliveryTpe = deliveryTpe;
        return this;
    }

    public Product build(){
        if(deliveryTpe.equalsIgnoreCase("standerd") && finance && insuranceType.equalsIgnoreCase("fullcoverage"))
            return new Product(size,screenType,isSmartTv,"moderate");
        else if(deliveryTpe.equalsIgnoreCase("standerd") && finance && insuranceType.equalsIgnoreCase("basic"))
            return new Product(size,screenType,isSmartTv,"base");
        else if(deliveryTpe.equalsIgnoreCase("expediated") && finance && insuranceType.equalsIgnoreCase("basic"))
            return new Product(size,screenType,isSmartTv,"moderate");
        else if(deliveryTpe.equalsIgnoreCase("expediated") && finance && insuranceType.equalsIgnoreCase("fullcoverage"))
            return new Product(size,screenType,isSmartTv,"premium");

        return new Product(size,screenType,isSmartTv,"base");

    }





}
