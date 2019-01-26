public class creadorDePizza {

    public static void main(String[] args) {

        Pizza pizzaPlana= new PizzaPlana();
        Mozarella moz= new Mozarella(pizzaPlana);

        System.out.println("Descripcion:" + moz.getDescription());
        System.out.println("Costo: " + moz.getCost());
    }
}
