import java.lang.Math;
import java.util.Scanner;

public class Game {
    public void play(){
    int turn = 0;
    int max = 2;
    int min = 2;
    int range = max - min + 1;
    int rando = (int)(Math.random() * range) + min;
    if (rando == 1){
    System.out.println("Player 1 will go first");
    Player.getName(rando);
    Player.getName(2);
    turn += 1;

    }
    else {
    System.out.println("Player 2 will go first");
    Player.getName(rando);
    Player.getName(1);
    turn += 2;
    }
    int boardPieces = Board.getNumPieces();
    int piecesRemoved = 0;
        for (int i = boardPieces; i > 1; i -= piecesRemoved){
            if (turn == 1){
                Scanner p1 = new Scanner(System.in);
                System.out.println("Player 1, how many objects would you like to get rid of?");
                int player1_move = p1.nextInt();
                boardPieces = Board.removePieces(player1_move, boardPieces);
                System.out.println(boardPieces);
                if (boardPieces == 1){
                    break;
                }
                else {
                    turn = 2;
                }
            }
            if (turn == 2){
                Scanner p2 = new Scanner(System.in);
                System.out.println("Player 2, how many objects would you like to get rid of?");
                int player2_move = p2.nextInt();
                boardPieces = Board.removePieces(player2_move, boardPieces);
                System.out.println(boardPieces);
                if (boardPieces == 1){
                    break;
                }
                else {
                    turn = 1;
                }
            }

        }
        if (turn == 1){
            System.out.println("One point for player 2");
            Player.incrScore(2);
        }
        else {
            System.out.println("One point for player 1");
            Player.incrScore(1);
        }
        Scanner choice = new Scanner (System.in);
        System.out.println("Do you want to keep playing? True for yes, False for no");
        boolean user_choice = choice.nextBoolean();
        if (user_choice = true){
            Game nim = new Game(); 
        nim.play();
        }
        }

}