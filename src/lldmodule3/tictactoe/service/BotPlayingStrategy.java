package lldmodule3.tictactoe.service;

import lldmodule3.tictactoe.models.Game;
import lldmodule3.tictactoe.models.Move;
import lldmodule3.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Player player, Game game);
}
