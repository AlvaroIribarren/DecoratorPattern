public class Mozarella extends ToppingDecorator {

    public Mozarella(Pizza nuevaPizza) {
        super(nuevaPizza);
    }

    public String getDescription() {
        return this.pizza.getDescription() + ", con Mozarella.";
    }

    public int getCost() {
        return this.pizza.getCost() + 2;
    }
}
