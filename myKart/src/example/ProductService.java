package example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sduraisamy on 6/18/2016.
 */
public class ProductService {


    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean deleteProduct(String s) {
        for(Product product:products){
            if(product.getProductName().equalsIgnoreCase(s)){
                products.remove(product);
                return true;
            }
        }
        return false;
    }
}
