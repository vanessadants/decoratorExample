package pizzaExample.decorator;

import pizzaExample.domain.Order;

public class ExtraTopping extends Extra{

    public ExtraTopping(String label, double price, Order order) {
        super(label, price, order);
    }

    public double getPrice() {
        return this.price+order.getPrice();
    }

}

