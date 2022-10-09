package NithinJose_Lab_2_OOPs;
import java.util.*; 

class Menu {

}

class MenuItem {
    public int getPrice(){
        int price = 0;
        return price;
    };
}

enum CrustType {
    Thin,
    Thick
}

enum PizzaSize {
    Large,
    Medium,
    Small
}

enum Topping {
    Cheese,
    Mushroom,
    Tomato,
    Jalapeno,
    Spinach
}


class Pizza extends MenuItem {

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

class VegPizza extends Pizza {

    VegPizza(CrustType crust, PizzaSize size, Topping[] toppings) {
        super(crust, size, toppings);
    }

    public int getPrice() {
        int price = super.getPrice(20, 40, 60);
        return price;
    }
}

class NonVegPizza extends Pizza {

    NonVegPizza(CrustType crust, PizzaSize size, Topping[] toppings) {
        super(crust, size, toppings);
    }

    public int getPrice() {
        int price = super.getPrice(25, 50, 75);
        return price;
    }
}

class VeganPizza extends Pizza {

    VeganPizza(CrustType crust, PizzaSize size, Topping[] toppings) {
        super(crust, size, toppings);
    }

    public int getPrice() {
        int price = super.getPrice(15, 30, 45);
        return price;
    }
}

enum PastaType {
    Penne,
    Ditalini,
    Macaroni
}

enum PastaSauce {
    White,
    Red
}

class Pasta extends MenuItem {
    
    PastaSauce sauce;
    PastaType type;

    Map<PastaSauce, Integer> saucePriceMap
                = new HashMap<PastaSauce, Integer>();
    
    Pasta(
        PastaType type, PastaSauce sauce
    ){
        saucePriceMap.put(PastaSauce.White, 10);
        saucePriceMap.put(PastaSauce.Red, 20);
        this.sauce = sauce;
        this.type = type;
    }

    public int getPrice() {
        
        int price = super.getPrice();
        price += saucePriceMap.get(this.sauce);

        return price;
    }
}

class Customer {
    int id;
    String name;
}

class Kitchen {
    int id;
    Order[] activeOrders;
}

enum Status {
    Placed,
    Completed
}

class Order {
    Customer customer;
    MenuItem[] orderItems;
    Status status;
}



public class FoodOrdering {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Boolean ch = true;
        while(ch){
            System.out.println("\n1.Order Food\n2.Kitchen\n3.Exit");
            int choice = in2.nextInt();
            switch(choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    ch = false;
                    break;
            }
            if(ch){
                
            }
        }
        in.close();
        in2.close();
    }
}
