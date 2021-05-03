public class Campaign {
    private String campaignCode;
    private String campaignName;
    private double discount;

    public Campaign(){

    }
    public Campaign(String campaignCode,String campaignName,double discount){

        this.campaignCode=campaignCode;
        this.campaignName=campaignName;
        this.setDiscount(discount);

    }


    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
