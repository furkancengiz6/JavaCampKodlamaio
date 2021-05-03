import java.sql.SQLOutput;

public class GameBuyManager  implements GameBuySystem {


    @Override
    public void gameBuy(PlayerRegistration playerRegistration,GameBuy gameBuy) {
        System.out.println("Oyun satin alındı " +gameBuy.getGameName());
        System.out.println("Kalan Paranız :"+(playerRegistration.getMoneyInPocket()-gameBuy.getGamePrice()));
    }

    @Override
    public void gameUptade(PlayerRegistration playerRegistration,GameBuy gameBuy) {
        System.out.println("Oyun Güncellendi " +gameBuy.getGameName());
    }

    @Override
    public void gameDelete(PlayerRegistration playerRegistration,GameBuy gameBuy) {
        System.out.println("Oyun iade edildi " +gameBuy.getGameName());
        System.out.println("Kasanızdaki para"+(playerRegistration.getMoneyInPocket()+ gameBuy.getGamePrice()));
    }

    @Override
    public void gameBuyCampaign(PlayerRegistration playerRegistration, GameBuy gameBuy,Campaign campaign) {
        System.out.println("Kampanyalı Oyun satın alındı :"+gameBuy.getGameName()+"Kampanya ismi :"+campaign.getCampaignName());

        System.out.println("İndirim Miktari  :"+((gameBuy.getGamePrice()*(campaign.getDiscount()))/100));

        System.out.println("Kalan paranız :"+(playerRegistration.getMoneyInPocket()-(gameBuy.getGamePrice()*(100-10))/100));

    }

    @Override
    public void gameDeleteCampaign(PlayerRegistration playerRegistration, GameBuy gameBuy,Campaign campaign) {
        System.out.println("Kampanya Silindi :"+campaign.getCampaignName());

    }
}


