public class GameBuy {
    private int gameId;
    private String gameName;
    private double gamePrice;



    public GameBuy(){

    }

    public GameBuy(int gameId,String gameName,int gamePrice){
        this.gameId=gameId;
        this.gameName=gameName;
        this.gamePrice=gamePrice;
    }


    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(double gamePrice) {
        this.gamePrice = gamePrice;
    }
}
