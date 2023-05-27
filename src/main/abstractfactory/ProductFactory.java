package main.abstractfactory;

import main.abstractfactory.caretool.CareTool;
import main.abstractfactory.product.Product;

public interface ProductFactory {

    Product createProduct(String name);

    CareTool createCareTool(String name);

}
