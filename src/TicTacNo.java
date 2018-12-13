import java.util.Scanner;

// Main TicTacToe Class
public class TicTacNo
{
    static private GameBoard gb;
    static private Player p1, p2, currentPlayer;
    static private String gameType;

    public static void main(String[] args)
    {
        System.out.println("Tic-Tac-No");
        GameSelect();
        gb = new GameBoard();
        gb.InitDisplay();
        currentPlayer = p1;

        while (true) {

            gb.UpdateBoard(currentPlayer.GetMark(), currentPlayer.TakeTurn());
            gb.Display();

            if (gb.WinCheck("X")) {
                System.out.println("The winner is X");
                break;
            }
            else if (gb.WinCheck("O")) {
                System.out.println("The winner is O");
                break;
            }
            else if (gb.IsFull()) {
                System.out.println("No winner! CAT!!!");
                break;
            }

            if (currentPlayer == p1)
                currentPlayer = p2;
            else
                currentPlayer = p1;
        }
    }



    private static void GameSelect()
    {
        System.out.println("(1) Human vs Human");
        System.out.println("(2) Human vs Computer");
        System.out.println("(3) Computer vs Computer");
        System.out.print("Select a game type by entering its number value: ");
        Scanner input = new Scanner(System.in);
        gameType = input.next();

        boolean valid = false;
        while(!valid)
        {
            switch (gameType)
            {
                // Human vs Human case
                case "1":
                    p1 = new Human("X");
                    p2 = new Human("O");
                    valid = true;
                    break;
                // Human vs Computer
                case "2":
                    p1 = new Human("X");
                    p2 = new Computer("O");
                    valid = true;
                    break;
                // Computer vs Computer
                case "3":
                    p1 = new Computer("X");
                    p2 = new Computer("O");
                    valid = true;
                    break;
                // Invalid input
                default:
                    System.out.println("Invalid input, please try again...");
                    gameType = input.next();
                    break;
            }
        }
    }
}