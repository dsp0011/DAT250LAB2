import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PincodeID implements Serializable {
    private String pincode;
    private int count;

    public PincodeID(String pincode, int count) {
        this.pincode = pincode;
        this.count = count;
    }

    public PincodeID() {
    }

    private String getPincode() {
        return this.pincode;
    }

    private void setPincode(String pincode) {
        this.pincode = pincode;
    }

    private int getCount() {
        return this.count;
    }

    private void setCount(int count) {
        this.count = count;
    }

}
