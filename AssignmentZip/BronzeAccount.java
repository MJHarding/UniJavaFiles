public class BronzeAccount extends StandardAccount implements Packages {
    //call constructor from superclass.
    public BronzeAccount(int dtm, int ntm, int mb) {
        super(dtm, ntm, mb);
    }
    //Set abstract methods to return class specific values from interface "Packages"
    public String accountType() {
        return "Bronze";
    }

    public double getDayMinutesPrice() {
        return BRONZE_DAYTIME_MINUTES;
    }

    public double getNightMinutesPrice() {
        return BRONZE_NIGHT_MINUTES;
    }

    public double getMegabytePrice() {
        return BRONZE_MB_OVER;
    }

    public double getPackageCost() {
        return BRONZE_PACKAGE_COST;
    }

    public int getChannelCount() {
        return BRONZE_CHANNELS;
    }
    public int getMbIncluded() {
        return BRONZE_MB_INCLUDED;
    }
    public double getMbOverPrice() {
        return BRONZE_MB_OVER;
    }
}
