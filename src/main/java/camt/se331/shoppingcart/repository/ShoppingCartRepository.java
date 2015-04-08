package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by P-OniSawa on 8/4/2558.
 */
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {

}
