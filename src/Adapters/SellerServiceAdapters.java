package Adapters;

import Abstracts.SellerDiscountService;
import Entities.Games;

public class SellerServiceAdapters implements SellerDiscountService {

    @Override
    public double discountPrice(Games games) {
    
        return games.getPrice() - (games.getPrice() * games.getDiscount()) / 100;
        
    }
}
