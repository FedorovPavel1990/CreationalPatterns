package main.abstractfactory;

import main.abstractfactory.caretool.CareTool;
import main.abstractfactory.caretool.WoodenCareTool;
import main.abstractfactory.product.Product;
import main.abstractfactory.product.WoodenProduct;

public class WoodenProductFactory implements ProductFactory {

    @Override
    public Product createProduct(String name) {
        return new WoodenProduct(name);
    }

    @Override
    public CareTool createCareTool(String name) {
        return new WoodenCareTool(name);
    }

}
