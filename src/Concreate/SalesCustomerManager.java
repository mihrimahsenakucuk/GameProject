package Concreate;

import Abstracts.BaseSellerManager;
import Abstracts.SellerService;
import Adapters.SellerServiceAdapters;
import Entities.Customer;
import Entities.Games;

import java.util.Base64;

public class SalesCustomerManager extends BaseSellerManager {

    SellerServiceAdapters sellerServiceAdapters;

    public SalesCustomerManager(SellerServiceAdapters sellerServiceAdapters){
        this.sellerServiceAdapters= sellerServiceAdapters;
    }


    @Override
    public void sell(Games games, Customer customer) {
        super.sell(games, customer);
    }
}
