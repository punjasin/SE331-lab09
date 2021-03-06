package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.ShoppingCart;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
public interface ShoppingCartService {
    ShoppingCart findByid(Long id);
    List<ShoppingCart> getShoppingCarts();
    List<ShoppingCart> getShoppingCartBetween(Date stateDate, Date stopDate);
    ShoppingCart addShoppingCart(ShoppingCart shoppingCart);
    ShoppingCart deleteShoppingCart(ShoppingCart shoppingCart);
}
