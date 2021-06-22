package Concreate;

import Abstracts.BaseCampaignManager;
import Adapters.SellerServiceAdapters;
import Entities.Customer;
import Entities.Games;

public class CampainingManager extends BaseCampaignManager {

    SellerServiceAdapters sellerServiceAdapters;


    public CampainingManager(SellerServiceAdapters salesServiceAdapters) {
        this.sellerServiceAdapters = sellerServiceAdapters;
    }

    @Override
    public void campaignAdd(Games games, Customer customer) {
        super.campaignAdd(games, customer);
    }

    @Override
    public void campaignUpdate(Games games, Customer customer) {
        games.setPrice((int)this.sellerServiceAdapters.discountPrice(games));
        super.campaignUpdate(games, customer);
    }

    @Override
    public void campaignDelete(Games games, Customer customer) {
        super.campaignDelete(games, customer);
    }

}
