import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pincode {
    @EmbeddedId
    private PincodeID  pincodeID;

    public void setPincode(PincodeID pincodeID) {
        this.pincodeID = pincodeID;
    }

    public PincodeID getPincode() {
        return pincodeID;
    }
}
