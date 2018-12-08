import java.util.Scanner;

// Human sub-class
public class Human extends Player
{
    public Human(String m)
    {
        super(m);
    }

    @Override
    public int TakeTurn()
    {
        System.out.printf("Current Player ---> %s\n", this.mark);
        Scanner input = new Scanner(System.in);
        String tempIn;

        // Conversion of input to int and robust input validation
        do {
            System.out.println("Select a space... (1-9)");
            tempIn = input.nextLine();

            // Check for single integer
            if (Character.isDigit(tempIn.charAt(0)) && tempIn.length() == 1)
            {
                choice = Integer.parseInt(tempIn);

                // Check that space has not been used already
                if (GameBoard.gBoard[choice - 1] != " ")
                {
                    System.out.println("Space already used, try again...");
                    choice = 0;
                }
            }
            else
            {
                System.out.println("Please enter one digit...");
                choice = 0;
            }
        } while (choice < 1 || choice > 9);     // Check that input is between 1 and 9

        return (choice - 1);
    }
}