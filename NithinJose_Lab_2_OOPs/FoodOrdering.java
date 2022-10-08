package NithinJose_Lab_2_OOPs;

class Menu {

}

class MenuItem {

}

class Pizza extends MenuItem {

}

class Pasta extends MenuItem {

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
        
    }
}
