import java.util.Random;

public class Computer extends Player
{
    Computer(String m)
    {
        super(m);
    }

    @Override
    public int TakeTurn() {
        Random rand = new Random();
        int randChoice;

        do {
            randChoice = rand.nextInt(9);
        }while (GameBoard.gBoard[randChoice] != " ");

        return randChoice;
    }
}