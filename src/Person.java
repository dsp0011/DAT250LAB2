import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    @Id
    private String name;

    @ManyToMany
    private List<Address> addressList = new ArrayList<Address>();

    @OneToMany
    private List<CreditCard> creditCardList = new ArrayList<CreditCard>();

    @OneToMany
    public List<CreditCard>  getCreditCardList() {
        return creditCardList;
    }

    public void setCreditCardList(List<CreditCard>  creditCardList) {
        this.creditCardList = creditCardList;
    }

    @ManyToMany
    public List<Address>  getAddressList() {
        return addressList;
    }
    public void setAddressList(List<Address>  addressList) {
        this.addressList = addressList;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    public String getName() {
        return name;
    }
}
