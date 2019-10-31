package pizzaExample.decorator;

import pizzaExample.domain.Order;

public abstract class Extra implements Order {

    protected Order order;
    protected String label;
    protected double price;

    public Extra(String label, double price, Order order) {
        this.label=label;
        this.price = price;
        this.order=order;
    }

    // O preço é delegado para a implementação concreta
    public abstract double getPrice();

    // Label default é fornecido
    public String getLabel() {
        return order.getLabel()+", "+this.label;
    }

}
