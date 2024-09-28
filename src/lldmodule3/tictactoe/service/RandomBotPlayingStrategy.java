package lldmodule3.tictactoe.service;

import lldmodule3.tictactoe.models.*;

import java.util.List;

public class RandomBotPlayingStrategy {

    public static Move makeMove(Player player, Game game) {
        Board board = game.getBoard();
        for(List<Cell> cells : board.getCells()){
            for(Cell cell : cells){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    cell.setCellState(CellState.FILLED);
                    cell.setPlayer(player);
                    Move move = new Move(cell, player);
                    game.getMoves().add(move);
                    game.getPlayedBoards().add(game.getBoard().clone());
                    return move;
                }
            }
        }
        return null;
    }
}
