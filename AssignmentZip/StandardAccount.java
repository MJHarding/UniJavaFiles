public abstract class StandardAccount implements Packages{
    //make protected not private attributes.
    protected int daytimeMinutes = 0;
    protected int nighttimeMinutes = 0;
    protected int megabytesUsed = 0;

    //construtors
    public StandardAccount (int dtm, int ntm, int mb) {
        this.daytimeMinutes = dtm;
        this.nighttimeMinutes = ntm;
        this.megabytesUsed = mb;
    }


    //Accessors
    public int getDaytimeMinutes() {
        return daytimeMinutes;
    }

    public int getNightTimeMinutes() {
        return nighttimeMinutes;
    }

    public int getMegabytesUsed() {
        return megabytesUsed;
    }
    //calculates the difference between megabytes used and whats included in the package.
    public int getMbDifference() {
        int difference = (getMegabytesUsed() - getMbIncluded());
        if (difference < 0 ) {
            return 0;
        } else return difference;
    }
    //Abstract methods
    public abstract String accountType();

    public abstract double getPackageCost();

    public abstract double getDayMinutesPrice();

    public abstract double getNightMinutesPrice();

    public abstract double getMegabytePrice();

    public abstract int getChannelCount();

    public abstract int getMbIncluded();

    public abstract double getMbOverPrice();
    //calculate the total cost of each package, using base price + all addons given user input.
    public double totalCost() {
        return (getPackageCost() + (getDaytimeMinutes() * getDayMinutesPrice()) +
        (getNightTimeMinutes() * getNightMinutesPrice()) + (getMbDifference() *getMbOverPrice()));
    }
    //print out desired calculations for given account.
    public void printCalculations() {
        System.out.println("\n\nAccount summary for " + accountType() + " account.");
        System.out.println("Package cost: " + getPackageCost());
        System.out.println("Cost of daytime calls: " + getDayMinutesPrice() + "/min.");
        System.out.println("Cost of evening calls: " + getNightMinutesPrice());
        System.out.println("Number of channels: " + getChannelCount());
        System.out.println("Broadband included : "+getMbIncluded()+"Mb");
        System.out.println("Broadband Cost (above included limit) : " + getMbOverPrice() );
        System.out.println("Total daytime calls cost: " + (getDaytimeMinutes() * getDayMinutesPrice()));
        System.out.println("Total evening calls cost: " + getNightTimeMinutes() * getNightMinutesPrice());
        System.out.println("Total (extra) broadband cost: " + getMbDifference() * getMbOverPrice());
        System.out.println("The total cost with this package would be : "+ totalCost());
        System.out.println("");
        //print addons dependant on account type
        if (accountType() == "Silver" || accountType() == "Gold") System.out.println(SPOTIFY);
        if (accountType() == "Gold") System.out.println(MUSIC_ON_DEMAND);
    }
}
