package lldmodule3.tictactoe.controller;

import lldmodule1.oops3_inheritance_polymorphism.B;
import lldmodule3.tictactoe.exception.InvalidCellChosenException;
import lldmodule3.tictactoe.exception.InvalidUndoCommandException;
import lldmodule3.tictactoe.models.*;
import lldmodule3.tictactoe.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    private PlayerService playerService;
    private GameService gameService;
    private Scanner sc;

    public GameController(PlayerService playerService, GameService gameService) {
        this.playerService = playerService;
        sc = new Scanner(System.in);
        this.gameService = gameService;
    }

    public List<Player> generatePlayerList(int size){

        System.out.println("Please enter 1 if you want a bot, else enter 0");
        int botResult = 1;
        Bot bot;
        List<Player> players = new ArrayList<>();

        if(botResult == 1){
            bot = playerService.createBot("BOT", '$');
            size--;
            players.add(bot);
        }

        for (int i = 0; i < size - 1; i++) {
            System.out.println("Please enter the name for player : " + (i + 1));
            String name = sc.nextLine();
            System.out.println("Please enter the character for the player : " + name);
            char symbol = sc.nextLine().charAt(0);
            players.add(playerService.createPlayer(name, symbol));
        }
        return players;
    }

    public Move createMove(Player player, Game game){
        if(player.getPlayerType().equals(PlayerType.HUMAN)) {
            System.out.println("Please enter the row number");
            int row = sc.nextInt();
            System.out.println("Please enter the col number ");
            int col = sc.nextInt();
            // TODO : validate the row and col range within board
            try {
                return gameService.executeMove(player, game, row, col);
            } catch (InvalidCellChosenException ex) {
                // TODO: handle new entry logic
            }
        } else {
            return RandomBotPlayingStrategy.makeMove(player, game);
        }
        return null;
    }

    public Player checkWinner(Board board, Move move, CheckWinnerUtil checkWinnerUtil) {
        return checkWinnerUtil.checkWinner(board, move);
    }

    public Game undoGame(int moves, Game game){
        if(moves > game.getMoves().size()){
            throw new InvalidUndoCommandException("Number of undo steps is invalid");
        }
        return gameService.undoMove(moves, game);
    }

    public void replay(Game game){
        gameService.replay(game);
    }
}
