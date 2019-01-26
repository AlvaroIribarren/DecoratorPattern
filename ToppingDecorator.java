abstract class ToppingDecorator {

    protected Pizza pizza;

    public ToppingDecorator(Pizza nuevaPizza){
        this.pizza = nuevaPizza;
    }

    public String getDescription() {
        return this.pizza.getDescription();
    }

    public int getCost() {
        return this.pizza.getCost();
    }
}
