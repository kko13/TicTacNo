public class TicTacNo {

    public static void main(String[] args)
    {
        GameBoard gb = new GameBoard();

        //Simple gameboard output test
        gb.Display();
        gb.UpdateBoard("X", 4);
        gb.Display();
    }
}
