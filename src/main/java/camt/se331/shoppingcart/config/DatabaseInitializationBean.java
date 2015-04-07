package camt.se331.shoppingcart.config;

/**
 * Created by Punjasin on 7/4/2558.
 */

        import camt.se331.shoppingcart.entity.Product;

        import camt.se331.shoppingcart.entity.SelectedProduct;
        import camt.se331.shoppingcart.entity.ShoppingCart;
        import camt.se331.shoppingcart.repository.ProductRepository;

        import camt.se331.shoppingcart.repository.ShoppingCartRepository;
        import org.springframework.beans.factory.InitializingBean;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.annotation.Profile;
        import org.springframework.stereotype.Component;

        import java.util.*;

@Profile("db.init")
@Component


public class DatabaseInitializationBean implements InitializingBean {
    @Autowired
    ProductRepository productRepository;
@Autowired
    ShoppingCartRepository shoppingCartRepository;
    @Override
    public void afterPropertiesSet() throws Exception {
        Product[] initProduct = {
                new Product(1l, "Kiddle", "the good book reader", 6900.00),
                new Product(2l, "Surface Pro", "the unknown computer", 34000.00),
                new Product(3l, "Mac Pro", "Mac Book interim", 44000.00),
                new Product(4l, "Candle", "use for lightenup the world", 10.00),
                new Product(5l, "Bin", "User for what", 200.00),
                new Product(6l, "Telephone", "Call to other", 150.00),
                new Product(7l, "IPhone", "What is it?", 26000.00),
                new Product(8l, "Galaxy Note 4", "Who still use this ?", 24000.00),
                new Product(9l, "AngularJS", "We hate it", 2000.00),
                new Product(10l, "Mazda 3", "Very handsome guy use this", 300000.00)


        };
productRepository.save(Arrays.asList(initProduct));
        productRepository.save(new Product(1l, "Kiddle", "the good book reader", 6900.00));
        ShoppingCart shoppingCart=new ShoppingCart();
        List<SelectedProduct> selectedProducts=new ArrayList<>();
        SelectedProduct[] initSelectedProduct={
                new SelectedProduct(initProduct[2],5),
                new SelectedProduct(initProduct[4],2),
                new SelectedProduct(initProduct[1],1)
        };
        selectedProducts.addAll(Arrays.asList(initSelectedProduct));
        Calendar calendar=new GregorianCalendar(2015,4,7);
        shoppingCart.setSelectedProducts(selectedProducts);
        shoppingCart.setPurchaseDate(calendar.getTime());
        shoppingCart.setId(1L);
        shoppingCartRepository.save(shoppingCart);
    }
}
