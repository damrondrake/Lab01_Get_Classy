import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {
    @Test
    public void testCalculateDiscountedCost() {
        Product p = new Product("Product1", "This is a product", "P001", 10);
        double discountedCost = p.calculateDiscountedCost(0.1);
        assertEquals(9, discountedCost, 0);
    }
}