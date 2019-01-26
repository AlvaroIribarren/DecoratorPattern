public class PizzaPlana implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza plana";
    }

    @Override
    public int getCost() {
        return (int) 4.00;
    }
}
