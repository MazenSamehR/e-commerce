import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        ProductTest.class,
        ShoppingCartTest.class,
        CustomerTest.class,
})
public class AllTestsSuite {
}