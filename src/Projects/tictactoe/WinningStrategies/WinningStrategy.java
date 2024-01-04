package Projects.tictactoe.WinningStrategies;

import Projects.tictactoe.models.Board;
import Projects.tictactoe.models.Move;

public interface WinningStrategy {

    boolean checkWinner(Board board, Move move);

    void undo(Board board, Move lastMove);
}