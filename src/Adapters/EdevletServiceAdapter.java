package Adapters;

import Abstracts.CustomerCheckService;
import Entities.Customer;

public class EdevletServiceAdapter implements CustomerCheckService {


    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return customer.getNationlityId().length() == 11;
    }
}
