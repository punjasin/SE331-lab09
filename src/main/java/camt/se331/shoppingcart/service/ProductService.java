package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.Product;
import camt.se331.shoppingcart.entity.ShoppingCart;
import org.springframework.context.annotation.Profile;

import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ProductService {
    ShoppingCart findById(Long id);
    List<Product> getProducts();
    List<Product> getProductByName(String name);
    List<Product> getProductByNameOrDescription(String name,String description);
    Product getProduct(Long id);
    Product addProduct(Product product);
    Product deleteProduct(Long id);
    Product updateProduct(Product product);
}
