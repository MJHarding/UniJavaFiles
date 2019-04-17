import java.util.*;
public class Game {

    public static void main(String[] args) {
        gameOutput();
        }

        //throw a dice at random.
    public static int diceThrow() {
        int dice = 1 + (int)(6 * Math.random());
        return dice;
    }

        // Get the number of rounds to play
    public static int getRounds() {

        Scanner input = new Scanner(System.in);
        //initialise rounds as a negative.
        int rounds = -1;
        //ask for input that is equal to or greater than 0
        do {
            System.out.print("Enter the number of round you wish to play (min 0) :  ");
            rounds = input.nextInt();
        } while (rounds < 0); // condition to validate input
        return rounds;
    }

    public static void gameOutput() {
        //declare variables to use
        int i, count=1;
        int rounds = getRounds();
        int p1WinCount = 0;
        int p2WinCount = 0;
        double p1Total = 0;
        double p2Total = 0;


        ThreeDiceScorer player1[] = new ThreeDiceScorer[rounds];
        ThreeDiceScorer player2[] = new ThreeDiceScorer[rounds];
        //create 2 arrays of size comparable to the rounds input. use the loop to fill with an object per "round".
        for (i=0; i < rounds; i++) {

            //set array[i]to new dice object
            player1[i] = new ThreeDiceScorer(diceThrow(), diceThrow(), diceThrow());
            System.out.print("Round " + count + "   Player 1: "+ player1[i].getDie1() + " " + player1[i].getDie2() + " " + player1[i].getDie3() + "   ");
            player1[i].scoreTotal();
            p1Total += player1[i].passScore();

            //repeat process for player2
            player2[i] = new ThreeDiceScorer(diceThrow(), diceThrow(), diceThrow());
            System.out.print("Round " + count + "   Player 2: "+ player2[i].getDie1() + " " + player2[i].getDie2() + " " + player2[i].getDie3() + "   ");
            player2[i].scoreTotal();
            p2Total += player2[i].passScore();
            count++;

            System.out.println(""); //print a blank line -- formatting

            //compare scores of player 1 and two to determin a win or draw for each player.
            if (player1[i].passScore() < player2[i].passScore()) {
                System.out.println("      Player 2 wins");
                p2WinCount ++ ;
            } else if (player1[i].passScore() == player2[i].passScore()){
                System.out.println("      Draw!");
            } else if (player1[i].passScore() > player2[i].passScore()) {System.out.println("      Player 1 wins");
                p1WinCount ++;}

        }
        //print win count
        System.out.println("Total wins:\n    Player 1: " + p1WinCount + "     Player 2: " + p2WinCount);
        System.out.println("Total score:\n    Player 1: " + p1Total + "     Player 2: " + p2Total);

        averagePerRound(p1Total, p2Total, rounds);
        //print overall winner on points
        if (p1Total < p2Total) System.out.println("Overall points winner is player 2");
        else if (p1Total == p2Total) System.out.println("Overall points ends with a draw!");
        else System.out.println("Overall points winner is player 1");
    }

    //calculate average points obtained by each player per round by dividing total by round count.
    public static void averagePerRound(double p1Total,double p2Total, double rounds) {
        System.out.println("\nAverage Points per round: ");
        System.out.print("    Player 1: " + (p1Total/rounds) + "     ");
        System.out.print("Player 2: " + (p2Total/rounds) + "\n");
    }
}
