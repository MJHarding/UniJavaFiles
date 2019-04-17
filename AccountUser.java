import java.util.Scanner;
public class AccountUser{

    public static void main(String[] args){
        //collect and store user input in appropriate variables
        int dtm = obtainDaytimeMins();
        int ntm = obtainNighttimeMins();
        int mb = obtainMegaBytes();
        //create new object for each account type for calculation
        StandardAccount b = new BronzeAccount(dtm, ntm, mb);
        StandardAccount s = new SilverAccount(dtm, ntm, mb);
        StandardAccount g = new GoldAccount(dtm, ntm, mb);
        //print calculations for each object.
        b.printCalculations();
        s.printCalculations();
        g.printCalculations();
        //obtain total cost for each object type.
        double bronzeTotal = b.totalCost();
        double silverTotal = s.totalCost();
        double goldTotal = g.totalCost();
        //compare and print cheapest package type using obtained totals.
        comparePrices(goldTotal,silverTotal,bronzeTotal);
    }
    //get input for day time minutes from user
    public static int obtainDaytimeMins() {
        int dtm;
        Scanner input = new Scanner(System.in);
        do { // loop to validate input
            System.out.print("Please enter the number of daytime minutes used per month: ");
            dtm = input.nextInt();
            if (dtm < 0) { //checks input is 0  or greater
                System.out.println ("Value entered must be 0 or above.");
            }
        }while (dtm < 0);
        return dtm;
    }
    //get input for night time minutes from user
    public static int obtainNighttimeMins() {
        int ntm;
        Scanner input = new Scanner(System.in);
        do {  //loop to validate input
            System.out.print("Please enter the number of nighttime minutes used per month: ");
            ntm = input.nextInt();
            if (ntm < 0) { //checks input is 0 or greater
                System.out.println ("Value entered must be 0 or above.");
            }
        }while (ntm < 0);
        return ntm;
    }
    //obtain Mb from user input.
    public static int obtainMegaBytes() {
        int mb;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Please enter the number of data (in Mb) used per month: ");
            mb = input.nextInt();
            if (mb < 0) { // validate
                System.out.println ("Value entered must be 0 or above.");
            }
        }while (mb < 0);
        return mb;
    }
    //perform comparisons on total costs and return cheapest/best value for money in event of a tie
    public static void comparePrices(double goldTotal,double silverTotal,double bronzeTotal) {
        String bestPackage ="";
        if (goldTotal <= silverTotal && goldTotal <= bronzeTotal) {
            bestPackage = "Gold";
        } else if (silverTotal < goldTotal && silverTotal <= bronzeTotal) {
            bestPackage = "Silver";
        }else bestPackage  = "Bronze";
        System.out.println ("\nThe cheapest package for your usage is the " + bestPackage + " package" );
    }
}
