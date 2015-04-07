package camt.se331.shoppingcart.entity;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Dto on 2/7/2015.
 */
@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue
    Long id;
    @OneToMany(fetch = FetchType.EAGER)
            @Cascade(CascadeType.ALL)
    List<SelectedProduct> selectedProducts;
    @Temporal(TemporalType.TIMESTAMP)
    Date purchaseDate;
    public double getTotalProductPrice(){
        return 0.0;
    };

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShoppingCart)) return false;

        ShoppingCart that = (ShoppingCart) o;

        if (!id.equals(that.id)) return false;
        if (!purchaseDate.equals(that.purchaseDate)) return false;
        if (!selectedProducts.equals(that.selectedProducts)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + selectedProducts.hashCode();
        result = 31 * result + purchaseDate.hashCode();
        return result;
    }

    public List<SelectedProduct> getSelectedProducts() {
        return selectedProducts;
    }

    public void setSelectedProducts(List<SelectedProduct> selectedProducts) {
        this.selectedProducts = selectedProducts;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public ShoppingCart(List<SelectedProduct> selectedProducts) {

        this.selectedProducts = selectedProducts;
    }

    public ShoppingCart(List<SelectedProduct> selectedProducts, Date purchaseDate) {
        this.selectedProducts = selectedProducts;
        this.purchaseDate = purchaseDate;
    }

    public ShoppingCart() {

    }
}
