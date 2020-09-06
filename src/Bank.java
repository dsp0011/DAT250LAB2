import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bank {
    @Id
    private String name;

    @OneToMany
    private List<CreditCard> creditCardList = new ArrayList<CreditCard>();

    @OneToMany
    public List<CreditCard> getCreditCardList() {
        return creditCardList;
    }

    public void setCreditCardList (List<CreditCard> creditCardList) {
        this.creditCardList = creditCardList;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    public String getName() {
        return name;
    }
}
