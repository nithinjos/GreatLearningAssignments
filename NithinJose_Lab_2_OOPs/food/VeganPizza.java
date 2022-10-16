package food;

public class VeganPizza extends Pizza {

    VeganPizza(CrustType crust, PizzaSize size, Topping[] toppings) {
        super(crust, size, toppings);
    }

    public int getPrice() {
        int price = super.getPrice(15, 30, 45);
        return price;
    }
}
