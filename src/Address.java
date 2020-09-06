import java.util.List;
import java.util.ArrayList;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Address {
    @EmbeddedId
    private AddressID  AddressID;
    @ManyToMany
    private List<Person> personList = new ArrayList<Person>();

    public AddressID getAddressID() {
        return AddressID;
    }

    public void setAddressID(AddressID addressID) {
        AddressID = addressID;
    }

    @ManyToMany
    public List<Person> getPersonList() {
        return this.personList;
    }
    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}

