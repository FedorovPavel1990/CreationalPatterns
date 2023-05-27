package main.abstractfactory.product;

public class WoodenProduct extends Product {

    public WoodenProduct(String name) {
        super(name);
    }

    @Override
    public String getMaterial() {
        return "Дерево";
    }

}
