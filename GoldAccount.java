public class GoldAccount extends StandardAccount implements Packages{
    //call constructor from superclass.
    public GoldAccount(int dtm, int ntm, int mb) {
        super(dtm, ntm, mb);
    }
    //Set abstract methods to return class specific values from interface "Packages"
    public String accountType() {
        return "Gold";
    }

    public double getDayMinutesPrice() {
        return GOLD_DAYTIME_MINUTES;
    }

    public double getNightMinutesPrice() {
        return GOLD_NIGHT_MINUTES;
    }

    public double getMegabytePrice() {
        return GOLD_MB_OVER;
    }

    public double getPackageCost() {
        return GOLD_PACKAGE_COST;
    }

    public int getChannelCount() {
        return GOLD_CHANNELS;
    }

    public int getMbIncluded() {
        return GOLD_MB_INCLUDED;
    }
    
    public double getMbOverPrice() {
        return GOLD_MB_OVER;
    }
}
