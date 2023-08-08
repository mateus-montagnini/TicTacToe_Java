import javax.sound.midi.Soundbank;
import java.util.Scanner;
//'g G h H ""'

public class TicTacToe {

    public static void main(String[] args) {

        char [][] gameBord = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };
        printGameBoard(gameBord);

        Scanner scan = new Scanner(System.in);
        System.out.println("ENter your placement (1-9)");
        scan.nextInt();
    }

    public static void printGameBoard(char[][] gameBord) {
        for(char[] row : gameBord) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
