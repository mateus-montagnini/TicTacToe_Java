import javax.sound.midi.Soundbank;
import java.util.*;
//'g G h H ""'

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> playecpuPositionsrPositions = new ArrayList<Integer>();


    public static void main(String[] args) {

        char [][] gameBord = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };
        printGameBoard(gameBord);

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9)");
            int playerPos = scan.nextInt();


            placePiece(gameBord, playerPos, "player");
            Random rand = new Random();
            int cpuPos = rand.nextInt(9) + 1;
            placePiece(gameBord, cpuPos, "cpu");

            printGameBoard(gameBord);
        }
    }

    public static void printGameBoard(char[][] gameBord) {
        for(char[] row : gameBord) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBord, int pos, String user){
        char symbol = ' ';

        if(user.equals("player")) {
            symbol = 'X';
        } else if(user.equals("cpu")) {
            symbol = 'O';
        }

        switch (pos) {
            case 1:
                gameBord[0][0] = symbol;
                break;
            case 2:
                gameBord[0][2] = symbol;
                break;
            case 3:
                gameBord[0][4] = symbol;
                break;
            case 4:
                gameBord[2][0] = symbol;
                break;
            case 5:
                gameBord[2][2] = symbol;
                break;
            case 6:
                gameBord[2][4] = symbol;
                break;
            case 7:
                gameBord[4][0] = symbol;
                break;
            case 8:
                gameBord[4][2] = symbol;
                break;
            case 9:
                gameBord[4][4] = symbol;
                break;
            default:
                break;
        }
    }
    public static String checkWinner() {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List crossOne = Arrays.asList(1, 5, 9);
        List crossTwo = Arrays.asList(7, 5, 3);

        List<List> winningConditions;

        return "";
    }
}
