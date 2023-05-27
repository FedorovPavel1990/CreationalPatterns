package main.abstractfactory.caretool;

public class WoodenCareTool extends CareTool {

    public WoodenCareTool(String name) {
        super(name);
    }

    @Override
    public String getPurpose() {
        return "Для деревянных изделий";
    }

}
