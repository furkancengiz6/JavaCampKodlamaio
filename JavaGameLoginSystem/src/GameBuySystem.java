public interface GameBuySystem {
    void gameBuy(PlayerRegistration playerRegistration,GameBuy gameBuy);
    void gameUptade(PlayerRegistration playerRegistration,GameBuy gameBuy);
    void gameDelete(PlayerRegistration playerRegistration,GameBuy gameBuy);
    void gameBuyCampaign(PlayerRegistration playerRegistration,GameBuy gameBuy,Campaign campaign);
    void gameDeleteCampaign(PlayerRegistration playerRegistration,GameBuy gameBuy,Campaign campaign);
}
