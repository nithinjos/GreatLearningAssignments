package order;
import food.*;

public class Order {

    Customer customer;
    MenuItem[] orderItems;
    OrderStatus status;

    /**
     * @param customer
     * @param orderItems
     * @param status
     */

    public Order(Customer customer, MenuItem[] orderItems, OrderStatus status) {
        this.customer = customer;
        this.orderItems = orderItems;
        this.status = status;
    }

}
