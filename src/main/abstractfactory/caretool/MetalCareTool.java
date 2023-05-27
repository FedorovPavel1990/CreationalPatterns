package main.abstractfactory.caretool;

public class MetalCareTool extends CareTool {

    public MetalCareTool(String name) {
        super(name);
    }

    @Override
    public String getPurpose() {
        return "Для металлических изделий";
    }

}
