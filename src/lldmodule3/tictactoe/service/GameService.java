package lldmodule3.tictactoe.service;

import lldmodule3.tictactoe.exception.InvalidCellChosenException;
import lldmodule3.tictactoe.models.*;

import java.util.Collections;
import java.util.List;

public class GameService {

    public Game createGame(int size, List<Player> players){
        CheckWinnerUtil checkWinnerUtil = new CheckWinnerUtil(size);
        Game newGame = Game.builder()
                .size(size)
                .players(players)
                .checkWinnerUtil(checkWinnerUtil)
                .build(); // builds game objects -> builds the board object -> builds the matrix of cells -> builds the cell object
        return newGame;
    }

    public Game startGame(Game game){
        game.setGameState(GameState.IN_PROGRESS);
        List<Player> players = game.getPlayers();
        Collections.shuffle(players);
        return game;
    }

    public Move executeMove(Player player, Game game, int row, int col){
        Cell cell = game.getBoard().getCells().get(row).get(col);
        if(cell.getCellState() != CellState.EMPTY){
            throw new InvalidCellChosenException("Cell is already full");
        }
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(player);
        Move move = new Move(cell, player);
        game.getMoves().add(move);
        game.getPlayedBoards().add(game.getBoard().clone());
        return move;
    }
}
// Steps after playing a move
// Update - Board, Cell
// CheckWinner + checkDraw
// next player
// store move
// store board

// 9 mins -> 10:30 PM