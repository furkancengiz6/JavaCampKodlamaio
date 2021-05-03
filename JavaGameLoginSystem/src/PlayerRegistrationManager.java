public class PlayerRegistrationManager {

    private EdevletSystem edevletSystem;

    public PlayerRegistrationManager(EdevletSystem edevletSystem){
        this.edevletSystem=edevletSystem;
    }


    public void add(PlayerRegistration playerRegistration){
        System.out.println("Oyuncu eklendi :"+playerRegistration.getPlayerFirstName());
        this.edevletSystem.logAdd(playerRegistration.getPlayerFirstName());
    }

    public void update(PlayerRegistration playerRegistration){
        System.out.println("Oyuncu güncellendi :"+playerRegistration.getPlayerFirstName());
        this.edevletSystem.logUptade(playerRegistration.getPlayerFirstName());
    }

    public void delete(PlayerRegistration playerRegistration){
        System.out.println("Oyuncu silindi :"+playerRegistration.getPlayerFirstName());
        this.edevletSystem.logDelete(playerRegistration.getPlayerFirstName());
    }
}
