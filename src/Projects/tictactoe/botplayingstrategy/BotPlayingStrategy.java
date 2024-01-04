package Projects.tictactoe.botplayingstrategy;

import Projects.tictactoe.models.Board;
import Projects.tictactoe.models.Cell;

public interface BotPlayingStrategy {

    Cell makeMove(Board board);
}
