package example;

import org.junit.Assert;
import org.junit.Test;

public class ProductServiceTest {

    @Test
    public void addProduct() {
        Product product = new Product("dove bath soap", "soap", 60.0, "bath soap");
        Assert.assertEquals("dove bath soap", product.getProductName());
        ProductService productService = new ProductService();
        productService.addProduct(product);
        Product addedProduct = productService.getProducts().get(0);
        Assert.assertEquals(addedProduct.getProductName(), product.getProductName());
    }

    @Test
    public void deleteProduct() {
        ProductService productService = new ProductService();
        Product product = new Product("dove bath soap", "soap", 60.0, "bath soap");
        productService.addProduct(product);
        boolean deleted = productService.deleteProduct("dove bath soap");
        Assert.assertEquals(true, deleted);
        boolean deleted2 = productService.deleteProduct("dove bath soap");

    }

    @Test
    public void getProducts() {
        ProductService productService = new ProductService();
        Product product1 = new Product("dove bath soap1", "soap", 60.0, "bath soap");
        Product product2 = new Product("dove bath soap2", "soap", 60.0, "bath soap");
        productService.addProduct(product1);
        productService.addProduct(product2);
        Assert.assertEquals(2, productService.getProducts().size());
    }
}
