package camt.se331.shoppingcart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Dto on 2/7/2015.
 */
@Entity
public class SelectedProduct {
    @Id
    @GeneratedValue
            Long id;
    @OneToOne
    Product product;
    Integer amount;

    public SelectedProduct() {

    }

    public Double getTotalPrice(){
        return 0.0;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public SelectedProduct(Product product, Integer amount) {

        this.product = product;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SelectedProduct)) return false;

        SelectedProduct that = (SelectedProduct) o;

        if (!amount.equals(that.amount)) return false;
        if (!id.equals(that.id)) return false;
        if (!product.equals(that.product)) return false;

        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + product.hashCode();
        result = 31 * result + amount.hashCode();
        return result;
    }
}
