package food;
import java.util.*;

public class Pizza extends MenuItem{
    CrustType crust;
    PizzaSize size;
    Topping[] toppings;

    Map<Topping, Integer> toppingPriceMap
                = new HashMap<Topping, Integer>();
    
    Pizza(
        CrustType crust, PizzaSize size, Topping[] toppings
    ){
        toppingPriceMap.put(Topping.Cheese, 1);
        toppingPriceMap.put(Topping.Mushroom, 1);
        toppingPriceMap.put(Topping.Tomato, 1);
        toppingPriceMap.put(Topping.Jalapeno, 1);
        toppingPriceMap.put(Topping.Spinach, 1);
        this.crust = crust;
        this.size = size;
        this.toppings = toppings;
    }

    public int getPrice(int sPrice, int mPrice, int lPrice) {
        int price = super.getPrice();
    
        switch(this.size) {
            case Large:
                price += lPrice;
                break;
            case Medium:
                price += mPrice;
                break;
            case Small:
                price += sPrice;
                break;
        }
        for(int i = 0; i < this.toppings.length ; i++ ) {
            price += toppingPriceMap.get(this.toppings[i]);
        }
        return price;
    }
}
