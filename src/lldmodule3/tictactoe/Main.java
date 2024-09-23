package lldmodule3.tictactoe;

import lldmodule3.tictactoe.controller.GameController;
import lldmodule3.tictactoe.exception.GameDrawnException;
import lldmodule3.tictactoe.models.Game;
import lldmodule3.tictactoe.models.GameState;
import lldmodule3.tictactoe.models.Move;
import lldmodule3.tictactoe.models.Player;
import lldmodule3.tictactoe.service.BoardService;
import lldmodule3.tictactoe.service.GameService;
import lldmodule3.tictactoe.service.PlayerService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerService playerService = new PlayerService();
        GameService gameService = new GameService();
        BoardService boardService = new BoardService();

        GameController gameController = new GameController(playerService, gameService);

            System.out.println("WELCOME TO TICTACTOE GAME");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the dimension of the game");
            int size = sc.nextInt();
            List<Player> players = gameController.generatePlayerList(size);
            Game game = gameService.createGame(size, players);
            game = gameService.startGame(game);

            while(true) {
                int nextPlayerIndex = game.getNextMovePlayerIndex();
                Player currentPlayer = game.getPlayers().get(nextPlayerIndex);
                System.out.println("Player to make a move : " + currentPlayer.getName());
                Move move = gameController.createMove(currentPlayer, game);
                boardService.printBoard(game.getBoard());
                try {
                    Player winner = gameController.checkWinner(game.getBoard(), move, game.getCheckWinnerUtil());
                    if (winner != null) {
                        System.out.println("WINNER : " + winner.getName());
                        game.setGameState(GameState.WINNER_DONE);
                        boardService.printBoard(game.getBoard());
                        break;
                    }
                }catch (GameDrawnException ex){
                    System.out.println("Game is draw, please start again");
                    break;
                }
                game.setNextMovePlayerIndex((game.getNextMovePlayerIndex() + 1) % players.size());
            }
    }
}
// TODO -> remove validations from service layer
// TODO -> implement undo and replay methods