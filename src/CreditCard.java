import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CreditCard {
    @Id
    private int number;
    private int limit;
    private int balance;
    @ManyToOne
    private Bank bank;

    @ManyToOne
    public Bank getBank() {
        return this.bank;
    }
    public void setBank (Bank bank) {
        this.bank = bank;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}
