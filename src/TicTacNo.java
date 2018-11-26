import java.util.Scanner;

// Main TicTacToe Class
public class TicTacNo
{
    public static void main(String[] args)
    {
        System.out.println("Tic-Tac-No");
        System.out.println("Enter one of the following game types:");
        System.out.println("(1) Human vs Human");
        System.out.println("(2) Human vs Computer");
        System.out.println("(3) Computer vs Computer");

        Scanner input = new Scanner(System.in);
        int gameType = input.nextInt();
        GameBoard gb = new GameBoard();
        Player p1, p2, currPlayer;
        String winnner;

        switch(gameType)
        {
            // Human vs Human case;
            case 1:
                p1 = new Human("X");
                p2 = new Human("O");
                currPlayer = p1;

                while(!gb.WinCheck(currPlayer.GetMark()) && !gb.IsFull())
                {
                    System.out.printf("Current Player ---> %s\n", currPlayer.GetMark());
                    System.out.println("Select a space... (1-9)");
                    gb.Display();

                    gb.UpdateBoard(currPlayer.GetMark(), (input.nextInt()-1));
                    gb.Display();

                    gb.WinCheck(currPlayer.GetMark());
                    if (currPlayer.GetMark() == p1.GetMark())
                        currPlayer = p2;
                    else
                        currPlayer = p1;
                }

                if (gb.IsFull())
                    System.out.println("No winner! CAT!!!");
                else
                    System.out.printf("The winner is %s", currPlayer.GetMark());
                break;
        }
    }
}