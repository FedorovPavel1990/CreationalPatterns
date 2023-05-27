package main.abstractfactory.product;

public abstract class Product {

    private final String name;

    protected Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract String getMaterial();

    @Override
    public String toString() {
        return String.format("%s, материал - %s", name, getMaterial());
    }
}
