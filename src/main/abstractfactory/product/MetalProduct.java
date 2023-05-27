package main.abstractfactory.product;

public class MetalProduct extends Product {

    public MetalProduct(String name) {
        super(name);
    }

    @Override
    public String getMaterial() {
        return "Металл";
    }

}
