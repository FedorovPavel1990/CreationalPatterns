package main.builder;

public class PizzaBuilder {

    private final Integer size;
    private boolean cheese;
    private boolean tomato;
    private boolean jalapeno;
    private boolean bacon;
    private boolean pepperoni;

    public PizzaBuilder(Integer size) {
        this.size = size;
    }

    public PizzaBuilder withCheese() {
        this.cheese = true;
        return this;
    }

    public PizzaBuilder withTomato() {
        this.tomato = true;
        return this;
    }

    public PizzaBuilder withJalapeno() {
        this.jalapeno = true;
        return this;
    }

    public PizzaBuilder withBacon() {
        this.bacon = true;
        return this;
    }

    public PizzaBuilder withPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public Pizza build() {
        Pizza pizza = new Pizza(size);
        pizza.setCheese(cheese);
        pizza.setTomato(tomato);
        pizza.setJalapeno(jalapeno);
        pizza.setBacon(bacon);
        pizza.setPepperoni(pepperoni);
        return pizza;
    }
}
