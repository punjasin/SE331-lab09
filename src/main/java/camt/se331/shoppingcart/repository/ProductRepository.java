package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by CAMT on 4/7/2015.
 */
public interface ProductRepository extends JpaRepository<Product,Long> {

}
