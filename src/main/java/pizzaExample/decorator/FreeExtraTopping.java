package pizzaExample.decorator;

import pizzaExample.domain.Order;

public class FreeExtraTopping extends Extra {

    public FreeExtraTopping(String label, Order order) {
        super(label, 0, order);
    }

    public double getPrice() {
        return order.getPrice();
    }
}