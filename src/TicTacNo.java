import java.util.Scanner;

public class TicTacNo {

    public static void main(String[] args)
    {
        System.out.println("Tic-Tac-No");
        System.out.println("Enter one of the following game types:");
        System.out.println("(1) Player vs. Player");
        Scanner input = new Scanner(System.in);
        int gameType = input.nextInt();
        GameBoard gb = new GameBoard();
        Player p1, p2;

        switch(gameType)
        {
            case 1:
                p1 = new Human("X");
                p2 = new Human("O");
        }

        //Simple GameBoard output test
        gb.Display();
        gb.UpdateBoard("X", 4);
        gb.Display();
    }

}
