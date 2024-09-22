package lldmodule3.tictactoe.service;

import lldmodule3.tictactoe.exception.DuplicateSymbolException;
import lldmodule3.tictactoe.models.Player;
import lldmodule3.tictactoe.models.PlayerType;

import java.util.HashSet;

public class PlayerService {

    private static int counter = 1;
    private final HashSet<Character> symbolSet;

    public PlayerService() {
        this.symbolSet = new HashSet<>();
    }

    public Player createPlayer(String name, char symbol){
        if(symbolSet.contains(symbol)){
            throw new DuplicateSymbolException("Duplicate symbols are not allowed");
        }
        symbolSet.add(symbol);
        return new Player(
                counter++,
                name,
                symbol,
                PlayerType.HUMAN
        );
    }
}
