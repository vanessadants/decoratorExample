package pizzaExample;

import org.junit.Test;
import pizzaExample.decorator.ExtraTopping;
import pizzaExample.decorator.FreeExtraTopping;
import pizzaExample.domain.Order;
import pizzaExample.domain.Pizza;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class pizzaDecoratorsExample {

    @Test
    public void test_shouldDecoratePizza() {
        Order signaturePizza = new Pizza("Signature Pizza", 10);
        signaturePizza = new ExtraTopping("Pepperoni", 4, signaturePizza);
        signaturePizza = new FreeExtraTopping("Pepper", signaturePizza);

        assertThat(signaturePizza.getPrice(), is(14.0));
        assertThat(signaturePizza.getLabel(), is("Signature Pizza, Pepperoni, Pepper"));

    }

}
