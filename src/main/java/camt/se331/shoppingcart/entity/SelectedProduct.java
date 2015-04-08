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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SelectedProduct that = (SelectedProduct) o;

        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (product != null ? !product.equals(that.product) : that.product != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (product != null ? product.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    Integer amount;

    public Double getTotalPrice(){
        return 0.0;
    }

    public SelectedProduct() {
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
}
