import java.util.Scanner;

// Main TicTacToe Class
public class TicTacNo
{
    static private GameBoard gb;
    static private Player p1, p2, currPlayer, lastPlayer;
    static private int gameType;

    public static void main(String[] args)
    {
        System.out.println("Tic-Tac-No");
        GameSelect();
        gb = new GameBoard();
        currPlayer = p1;
        lastPlayer = p2;

        switch(gameType)
        {
            case 1:
                while (!gb.WinCheck("X") && !gb.WinCheck("O") && !gb.IsFull()) {
                    System.out.printf("Current Player ---> %s\n", currPlayer.GetMark());
                    System.out.println("Select a space... (1-9)");

                    Scanner input = new Scanner(System.in);
                    int selection = input.nextInt() - 1;
                    gb.UpdateBoard(currPlayer.GetMark(), selection);
                    gb.Display();
                    gb.WinCheck(currPlayer.GetMark());
                    if (currPlayer.GetMark() == p1.GetMark()) {
                        currPlayer = p2;
                        lastPlayer = p1;
                    } else {
                        currPlayer = p1;
                        lastPlayer = p2;
                    }
                }

                if (gb.IsFull())
                    System.out.println("No winner! CAT!!!");
                else
                    System.out.printf("The winner is %s", lastPlayer.GetMark());

                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    private static void GameSelect()
    {
        System.out.println("Enter one of the following game types:");
        System.out.println("(1) Human vs Human");
        System.out.println("(2) Human vs Computer");
        System.out.println("(3) Computer vs Computer\n");

        Scanner input = new Scanner(System.in);
        gameType = input.nextInt();
        boolean valid = false;
        while(!valid)
        {
            switch (gameType)
            {
                // Human vs Human case
                case 1:
                    p1 = new Human("X");
                    p2 = new Human("O");
                    valid = true;
                    break;
                // Human vs Computer
                case 2:
                    p1 = new Human("X");
                    p2 = new Computer("O");
                    valid = true;
                    break;
                // Computer vs Computer
                case 3:
                    p1 = new Computer("X");
                    p2 = new Computer("O");
                    valid = true;
                    break;
                // Invalid input
                default:
                    System.out.println("Invalid input, please try again...");
                    gameType = input.nextInt();
                    break;
            }
        }
    }
}