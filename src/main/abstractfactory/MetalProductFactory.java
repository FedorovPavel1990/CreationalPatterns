package main.abstractfactory;

import main.abstractfactory.caretool.CareTool;
import main.abstractfactory.caretool.MetalCareTool;
import main.abstractfactory.product.MetalProduct;
import main.abstractfactory.product.Product;

public class MetalProductFactory implements ProductFactory {

    @Override
    public Product createProduct(String name) {
        return new MetalProduct(name);
    }

    @Override
    public CareTool createCareTool(String name) {
        return new MetalCareTool(name);
    }

}
