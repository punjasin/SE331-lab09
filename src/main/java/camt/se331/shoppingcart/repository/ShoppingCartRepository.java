package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Punjasin on 7/4/2558.
 */
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long>{

}
