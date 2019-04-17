public class SilverAccount extends StandardAccount implements Packages {
    //call constructor from superclass.
    public SilverAccount(int dtm, int ntm, int mb) {
        super(dtm, ntm, mb);
    }
    //Set abstract methods to return class specific values from interface "Packages"
    public String accountType() {
        return "Silver";
    }

    public double getDayMinutesPrice() {
        return SILVER_DAYTIME_MINUTES;
    }

    public double getNightMinutesPrice() {
        return SILVER_NIGHT_MINUTES;
    }

    public double getMegabytePrice() {
        return SILVER_MB_OVER;
    }
    
    public double getPackageCost() {
        return SILVER_PACKAGE_COST;
    }

    public int getChannelCount() {
        return SILVER_CHANNELS;
    }

    public int getMbIncluded() {
        return SILVER_MB_INCLUDED;
    }

    public double getMbOverPrice() {
        return SILVER_MB_OVER;
    }
}
