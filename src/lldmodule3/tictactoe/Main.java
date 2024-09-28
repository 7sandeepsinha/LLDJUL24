package lldmodule3.tictactoe;

import lldmodule3.tictactoe.controller.GameController;
import lldmodule3.tictactoe.exception.GameDrawnException;
import lldmodule3.tictactoe.models.*;
import lldmodule3.tictactoe.service.BoardService;
import lldmodule3.tictactoe.service.GameService;
import lldmodule3.tictactoe.service.PlayerService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerService playerService = new PlayerService();
        BoardService boardService = new BoardService();
        GameService gameService = new GameService(boardService);

        System.out.println("WELCOME TO TIC TAC TOE GAME");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the dimension of the game");
        int size = sc.nextInt();
        sc.nextLine();  // Consumes the leftover newline character

        List<Player> players = new ArrayList<>();
        for (int i = 0; i < size - 1; i++) {
            System.out.println("Please enter the name for player : " + (i + 1));
            String name = sc.nextLine();  // Read the player's name

            System.out.println("Please enter the character for the player : " + name);
            char symbol = sc.nextLine().charAt(0);  // Read the player's symbol
            players.add(playerService.createPlayer(name, symbol));
        }

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
                if(!currentPlayer.getPlayerType().equals(PlayerType.BOT)) {
                    System.out.println("Do you want to undo to a certain step ? 1 for yes, 0 for No");
                    int undo = sc.nextInt();
                    if (undo == 1) {
                        System.out.println("Please enter the number of moves you want to go back");
                        int undoCount = sc.nextInt();
                        game = gameController.undoGame(undoCount, game);
                    }
                }
                Move move = gameController.createMove(currentPlayer, game);
                boardService.printBoard(game.getBoard());
                try {
                    Player winner = gameController.checkWinner(game.getBoard(), move, game.getCheckWinnerUtil());
                    if (winner != null) {
                        System.out.println("WINNER : " + winner.getName());
                        game.setGameState(GameState.WINNER_DONE);
                        boardService.printBoard(game.getBoard());
                        System.out.println("Do you want a replay? 1 for Yes, 0 for No");
                        int replay = sc.nextInt();
                        if(replay == 1){
                            gameController.replay(game);
                        }
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