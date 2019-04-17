
public class ThreeDiceScorer extends ThreeDice {

    //Constructor call
    public ThreeDiceScorer(int s1, int s2, int s3) {
        super(s1, s2, s3);
    }

    public int sumOfDice() { // sum of all three dice thrown
        return getDie1() + getDie2() + getDie3();
    }

    public void scoreTotal() { //print the score total
        int score = 0;
        if (threeSame())
            score = sumOfDice() + 60;
        else if (runOfThree())
            score = sumOfDice() + 40;
        else if (pair())
            score = sumOfDice() + 20;
        else if (allDifferent())
            score = sumOfDice();

        System.out.print("Points: " + score + "    ");
    }
    public int passScore() { //return the value of the score
        int score = 0;
        if (threeSame())
            score = sumOfDice() + 60;
        else if (runOfThree())
            score = sumOfDice() + 40;
        else if (pair())
            score = sumOfDice() + 20;
        else if (allDifferent())
            score = sumOfDice();
        return score;
    }
}
