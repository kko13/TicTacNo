import java.util.InputMismatchException;
import java.util.Scanner;

// Human sub-class
public class Human extends Player
{
    public Human(String m)
    {
        super(m);
    }

    public int TakeTurn()
    {
        System.out.printf("Current Player ---> %s\n", this.mark);
        System.out.println("Select a space... (1-9)");

        Scanner input = new Scanner(System.in);

        while(true)
        {
            try
            {
                choice = input.nextInt() - 1;
                if (!GameBoard.usedSpaces.contains(choice))
                    return choice;
            }
            catch (InputMismatchException e)
            {
                System.out.println("Must enter a number. Try again...");
            }
        }
    }
}