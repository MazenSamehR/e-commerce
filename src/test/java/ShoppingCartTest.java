import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class ShoppingCartTest {
    private Customer customer;
    private ShoppingCart cart;
    private Product cheese,tv;

    @BeforeEach
    void setup(){
        customer = new Customer("test user", 100.0);
        cheese = new ExpirableProduct("cheese", 5.00, 10, LocalDate.now().plusDays(10), 0.5);
        tv = new NonExpirableProduct("TV", 500.0, 5, 15.0);
        cart = new ShoppingCart(customer);
    }

    @Test
    void testAddToCartValidQuantity() throws Exception{
        cart.addToCart(cheese, 2);
        assertEquals(1, cart.getItemCount());
    }

    @Test
    void testAddToCartExceedsQuantity() {
        assertThrows(Exception.class, () -> cart.addToCart(cheese, 11));
    }

    @Test
    void testCheckoutInsufficientBalance() throws Exception {
        cart.addToCart(tv, 1);
        cart.addToCart(cheese, 1);
        assertThrows(Exception.class, () -> cart.checkout());
    }
}