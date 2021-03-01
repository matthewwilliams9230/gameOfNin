import java.util.Scanner;

public class Player {
    static int playerOneScore = 0;
    static int playerTwoScore = 0;

    public static String getName(int playerNumber) {
        if (playerNumber == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Player 1 Name: ");
            String playerOneName = sc.nextLine();
            return playerOneName;

        } else if (playerNumber == 2) {
            Scanner sca = new Scanner(System.in);
            System.out.println("Player 2 Name: ");
            String playerTwoName = sca.nextLine();
            return playerTwoName;
        } else {
            return "please enter a valid number";
        }
    }

    public int getScore(int player_number) {
        if (player_number == 1) {
            return playerOneScore;
        } else {
            return playerTwoScore;
        }
    }

    public static void incrScore(int turn) {
        if (turn == 1) {
            playerOneScore += 1;
        } else {
            playerTwoScore += 1;
        }
    }
}
