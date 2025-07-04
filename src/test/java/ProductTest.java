import org.example.DigitalProduct;
import org.example.ExpirableProduct;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;


public class ProductTest {
    @Test
    void testExpirableProduct(){
        ExpirableProduct cheese = new ExpirableProduct("cheese", 5.99, 10, LocalDate.now().plusDays(1), 0.5);
        assertFalse(cheese.isExpired());
        ExpirableProduct expiredCheese = new ExpirableProduct("expired cheese", 5.99, 10, LocalDate.now().minusDays(1), 0.5);
        assertTrue(expiredCheese.isExpired());
    }

    @Test
    void testProductHasNegativeQuantity(){
        ExpirableProduct cheese = new ExpirableProduct("cheese", 5.99, -10, LocalDate.now().plusDays(1), 0.5);
        assertEquals(-10, cheese.getQuantity(), "Product has negative quantity");
    }

    @Test
    void testDigitalProductShipping(){
        DigitalProduct card = new DigitalProduct("Mobile Scratch Cards", 10.0, 100);
        assertFalse(card.requiresShipping());
    }
}
