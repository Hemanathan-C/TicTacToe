package Projects.tictactoe.controllers;


import Projects.tictactoe.Exceptions.DuplicateSymbolException;
import Projects.tictactoe.Exceptions.MoreThanOneBotException;
import Projects.tictactoe.Exceptions.PlayersCountMismatchException;
import Projects.tictactoe.WinningStrategies.WinningStrategy;
import Projects.tictactoe.models.Game;
import Projects.tictactoe.models.Player;

import java.util.List;

public class GameController {


    public Game startGame(int dimension, List<Player> playerList, List<WinningStrategy> winningStrategies) throws DuplicateSymbolException, PlayersCountMismatchException, MoreThanOneBotException {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(playerList)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void undo(Game game){
        game.undo();
    }















}