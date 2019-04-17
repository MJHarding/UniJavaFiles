public class Average {
    public static void main(String[] args) {
        fairAverageScore();
        weightedAverageScore();
    }
    // nested for loops to simulate every combination three standard die can be thrown as.
    public static void fairAverageScore() {
        int i, j, k;
        double total = 0;

        for (i=1; i<7; i++) { //represents die 1
            for(j = 1; j<7; j++) { //represents die 2
                for(k=1; k<7; k++){ // represents die 3
                    ThreeDiceScorer score = new ThreeDiceScorer(i,j,k);
                    total = total + score.passScore();//increase score each iteration
                }
            }
        }
        total = (total) /216.0;// divide by number of combinations of die to get average
        System.out.println("The none weighted dice average score is :" + total);
    }

    //does same as above but replaces the one on a single die with another 6
    public static void weightedAverageScore() {
        int i, j, k;
        double total = 0;
        int numWeighted = 0;

        for (i=1; i<7; i++) { //represents die 1
            for(j = 1; j<7; j++) { //represents die 2
                for(k=1; k<7; k++) { //represents die 3

                    if (i == 1) numWeighted = 6; //changes a 1 to a 6 so die face set is {2,3,4,5,6,6} as specified
                    else numWeighted = i;
                    ThreeDiceScorer score = new ThreeDiceScorer(numWeighted,j,k);
                    total = total + score.passScore();// increase score each iteration
                }
            }
        }
        total = (total) /216.0; //get average 
        System.out.println("The weighted dice average score is :" + total + " Which is 0.8 points higher");
    }
}
