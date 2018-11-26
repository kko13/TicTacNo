// GameBoard class
public class GameBoard
{
    String[] gBoard = new String[9];
    GameBoard()
    {
        for(int i = 0; i < 9; i++)
        {
            gBoard[i] = " ";

        }

    }

    void Display()
    {
        System.out.printf("\n%s | %s | %s\n---------\n", gBoard[0], gBoard[1], gBoard[2]);
        System.out.printf("%s | %s | %s\n---------\n", gBoard[3], gBoard[4], gBoard[5]);
        System.out.printf("%s | %s | %s\n", gBoard[6], gBoard[7], gBoard[8]);

    }

    void UpdateBoard(String mark, int pos)
    {
        gBoard[pos] = mark;

    }

    boolean IsFull()
    {
        int count = 0;
        for(int i = 0; i < 9; i++)
        {
            if(gBoard[i] != " ")
                count++;

        }
        if (count == 9)
            return true;
        else
            return false;
    }
}