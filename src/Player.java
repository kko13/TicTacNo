// Player base class
abstract public class Player
{
    String mark;
    int choice;

    public Player(String m)
    {
        this.mark = m;
        this.choice = 0;
    }

    public String GetMark()
    {
        return this.mark;
    }

    public int TakeTurn()
    {
        return this.choice;
    }
}