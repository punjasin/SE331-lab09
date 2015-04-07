package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.Product;
import org.springframework.context.annotation.Profile;

import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ProductService {
    List<Product> getProducts();
    List<Product> getProductByName(String name);
    Product getProduct(Long id);
    Product addProduct(Product product);
    Product deleteProduct(Long id);
    Product updateProduct(Product product);
}
