package main.builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private final Integer size;
    private boolean cheese;
    private boolean tomato;
    private boolean jalapeno;
    private boolean bacon;
    private boolean pepperoni;

    public Pizza(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public boolean isJalapeno() {
        return jalapeno;
    }

    public void setJalapeno(boolean jalapeno) {
        this.jalapeno = jalapeno;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Размер пиццы: ")
                .append(size).append('\n')
                .append("Состав пиццы: ");

        List<String> ingredients = new ArrayList<>();
        if (cheese) {
            ingredients.add("Сыр");
        }
        if (tomato) {
            ingredients.add("Помидор");
        }
        if (bacon) {
            ingredients.add("Бекон");
        }
        if (pepperoni) {
            ingredients.add("Пепперони");
        }
        if (jalapeno) {
            ingredients.add("Халапеньо");
        }
        return stringBuilder
                .append(String.join(", ", ingredients))
                .toString();
    }
}
