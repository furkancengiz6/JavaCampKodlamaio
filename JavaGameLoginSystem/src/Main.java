public class Main {

    public static void main(String[] args) {

    PlayerRegistration playerRegistration = new PlayerRegistration("Sena","Doğan","485236","30.07.1996","123456",600);
    PlayerRegistrationManager playerRegistrationManager = new PlayerRegistrationManager(new EdevletSystemManager());
    playerRegistrationManager.add(playerRegistration);
    playerRegistration.setPlayerFirstName("Furkan");
    playerRegistrationManager.update(playerRegistration);
    playerRegistrationManager.delete(playerRegistration);
    GameBuy gameBuy = new GameBuy(1,"Valorant",500);
    GameBuyManager gameBuyManager= new GameBuyManager();
    Campaign campaign = new Campaign("123456","Yaz Kampanyası",10);


    gameBuyManager.gameBuy(playerRegistration,gameBuy);

        gameBuyManager.gameBuyCampaign(playerRegistration,gameBuy,campaign);









    }
}
