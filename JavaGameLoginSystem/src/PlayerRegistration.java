public class PlayerRegistration {

    private String playerFirstName;
    private String playerLastName;
    private String playerIdentificationNumber;
    private String yearBirth;
    private String password;
    private double moneyInPocket;

    public PlayerRegistration(){

    }
    public  PlayerRegistration(String playerFirstName,String playerLastName,String playerIdentificationNumber,
                               String yearBirth,String password ,int moneyInPocket){
        this.playerFirstName=playerFirstName;
        this.playerLastName=playerLastName;
        this.playerIdentificationNumber=playerIdentificationNumber;
        this.yearBirth=yearBirth;
        this.password=password;
        this.setMoneyInPocket(moneyInPocket);
    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public String getPlayerIdentificationNumber() {
        return playerIdentificationNumber;
    }

    public void setPlayerIdentificationNumber(String playerIdentificationNumber) {
        this.playerIdentificationNumber = playerIdentificationNumber;
    }

    public String getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(String yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public double getMoneyInPocket() {
        return moneyInPocket;
    }

    public void setMoneyInPocket(int moneyInPocket) {
        this.moneyInPocket = moneyInPocket;
    }
}
