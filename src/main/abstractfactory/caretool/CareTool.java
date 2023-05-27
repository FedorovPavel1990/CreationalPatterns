package main.abstractfactory.caretool;

public abstract class CareTool {

    private final String name;

    protected CareTool(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract String getPurpose();

    @Override
    public String toString() {
        return String.format("%s, назначение - %s", name, getPurpose());
    }

}
