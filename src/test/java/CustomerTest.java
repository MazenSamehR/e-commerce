import org.example.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    @Test
    void testReduceBalanceSuccess() throws Exception{
        Customer customer = new Customer("test customer", 50.0);
        customer.reduceBalance(30.0);
        assertEquals(20.0, customer.getBalance(), "Balance should be reduced correctly");
    }

    @Test
    void testCustomerHasNegativeBalance(){
        Customer customer = new Customer("test customer", -50.0);
        assertEquals(-50.0, customer.getBalance(), "Customer has negative balance");
    }

    @Test
    void testReduceBalanceInsufficientFunds(){
        Customer customer = new Customer("test customer", 50.0);
        assertThrows(Exception.class, () -> customer.reduceBalance(60.0),"should be thrown for insufficient funds");
    }
}
