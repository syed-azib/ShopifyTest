package shopify;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by usmani on 2017-09-09.
 */
public class Response {

    List<InvalidCustomer> allInvalidCustomers= new ArrayList<InvalidCustomer>();

    public List<InvalidCustomer> getAllInvalidCustomers() {
        return allInvalidCustomers;
    }

    public void setAllInvalidCustomers(List<InvalidCustomer> allInvalidCustomers) {
        this.allInvalidCustomers = allInvalidCustomers;
    }


}
