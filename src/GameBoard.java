// GameBoard class
public class GameBoard {

    static String[] gBoard = new String[9];

    GameBoard() {
        for(int i = 0; i < 9; i++) {
            gBoard[i] = " ";
        }
    }

    void Display() {
        System.out.printf("\n%s | %s | %s            1 | 2 | 3\n---------            ", gBoard[0], gBoard[1], gBoard[2]);
        System.out.printf("---------\n%s | %s | %s            4 | 5 | 6\n---------            ", gBoard[3], gBoard[4], gBoard[5]);
        System.out.printf("---------\n%s | %s | %s            7 | 8 | 9\n", gBoard[6], gBoard[7], gBoard[8]);
    }

    void UpdateBoard(String mark, int pos) {
        gBoard[pos] = mark;
    }

    boolean IsFull() {
        int count = 0;
        for(int i = 0; i < 9; i++) {
            if(gBoard[i] != " ") count++;
        }

        if (count == 9)
            return true;
        else
            return false;
    }

    boolean WinCheck(String s) {
        // Check victory by row
        if ((gBoard[0] == s) && (gBoard[1] == s) && (gBoard[2] == s)) {
            return true;
        }
        if ((gBoard[3] == s) && (gBoard[4] == s) && (gBoard[5] == s)) {
            return true;
        }
        if ((gBoard[6] == s) && (gBoard[7] == s) && (gBoard[8] == s)) {
            return true;
        }

        // Check victory by column
        if ((gBoard[0] == s) && (gBoard[3] == s) && (gBoard[6] == s)) {
            return true;
        }
        if ((gBoard[1] == s) && (gBoard[4] == s) && (gBoard[7] == s)) {
            return true;
        }
        if ((gBoard[2] == s) && (gBoard[5] == s) && (gBoard[8] == s)) {
            return true;
        }

        // Check victory by diagonal
        if ((gBoard[0] == s) && (gBoard[4] == s) && (gBoard[8] == s)) {
            return true;
        }
        if ((gBoard[2] == s) && (gBoard[4] == s) && (gBoard[6] == s)) {
            return true;
        }

        // Return false to indicate no winner
        return false;
    }

}