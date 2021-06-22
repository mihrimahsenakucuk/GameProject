package Concreate;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class GamerCustomerManager extends BaseCustomerManager {
    CustomerCheckService customerCheckService;

    public GamerCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.add(customer);
        } else {
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Kişisi eklendi");
        }
    }

    @Override
    public void update(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.update(customer);
        } else {
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Kişisi güncellendi.");
        }

    }

    @Override
    public void delete(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)) {
            super.delete(customer);
        } else {
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " Kişisi silindi.");
        }

    }
}






