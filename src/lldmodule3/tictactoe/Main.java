package lldmodule3.tictactoe;

import lldmodule3.tictactoe.models.Game;
import lldmodule3.tictactoe.models.Player;
import lldmodule3.tictactoe.service.BoardService;
import lldmodule3.tictactoe.service.GameService;
import lldmodule3.tictactoe.service.PlayerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PlayerService playerService = new PlayerService();
        GameService gameService = new GameService();
        BoardService boardService = new BoardService();

        System.out.println("WELCOME TO TICTACTOE GAME");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the dimension of the game");
        int size = sc.nextInt();
        List<Player> players = new ArrayList<>();
        for(int i=0;i<size-1;i++){
            System.out.println("Please enter the name for player : " + (i+1));
            String name = sc.nextLine();
            name = sc.nextLine();
            System.out.println("Please enter the character for the player : " + name);
            char symbol = sc.nextLine().charAt(0);
            players.add(playerService.createPlayer(name, symbol));
        }

        Game game = gameService.createGame(size, players);
        game = gameService.startGame(game);
        boardService.printBoard(game.getBoard());
    }
}
