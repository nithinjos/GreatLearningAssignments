package food;

public class NonVegPizza extends Pizza {

    NonVegPizza(CrustType crust, PizzaSize size, Topping[] toppings) {
        super(crust, size, toppings);
    }

    public int getPrice() {
        int price = super.getPrice(25, 50, 75);
        return price;
    }
}
