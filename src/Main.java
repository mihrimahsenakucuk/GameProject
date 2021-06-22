import Abstracts.BaseCampaignManager;
import Abstracts.BaseCustomerManager;
import Abstracts.BaseSellerManager;
import Adapters.EdevletServiceAdapter;
import Adapters.SellerServiceAdapters;
import Concreate.CampainingManager;
import Concreate.GamerCustomerManager;
import Concreate.SalesCustomerManager;
import Entities.Gamer;
import Entities.Games;
import Entities.Seller;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager baseCustomerManager = new GamerCustomerManager(new EdevletServiceAdapter());
        BaseCampaignManager baseCampaignManager = new CampainingManager(new SellerServiceAdapters());
        BaseSellerManager baseSellerManager = new SalesCustomerManager(new SellerServiceAdapters());
        Gamer gamer = new Gamer("123456", "msk@gmail.com", "Mihrimah", "Küçük", LocalDate.of(2000, 6, 28), "122333", "msk");
        Seller seller = new Seller("987654", "ksm@gmail.com", "Sena", "Küçük", LocalDate.of(2000, 7, 28), "444455555", "ksm");
        Games game1 = new Games("xsxs" , 100 , 10);
        Games game2 = new Games("ds",200 , 20);
        baseCustomerManager.add(gamer);
        baseCustomerManager.delete(gamer);
        baseCustomerManager.update(gamer);
        baseSellerManager.sell(game1, gamer);
        baseSellerManager.sell(game2, gamer);
        baseCampaignManager.campaignAdd(game1, seller);
        baseCampaignManager.campaignUpdate(game1, seller);
        baseCampaignManager.campaignDelete(game1, seller);


    }
}