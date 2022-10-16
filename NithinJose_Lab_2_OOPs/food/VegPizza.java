package food;

public class VegPizza extends Pizza{
    VegPizza(CrustType crust, PizzaSize size, Topping[] toppings) {
        super(crust, size, toppings);
    }

    public int getPrice() {
        int price = super.getPrice(20, 40, 60);
        return price;
    }
}
