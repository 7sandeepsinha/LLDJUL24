package lldmodule3.tictactoe.service;

import lldmodule3.tictactoe.exception.GameDrawnException;
import lldmodule3.tictactoe.models.Board;
import lldmodule3.tictactoe.models.Move;
import lldmodule3.tictactoe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckWinnerUtil {
    private List<HashMap<Character, Integer>> rowHashMaps;
    private List<HashMap<Character, Integer>> colHashMaps;
    private HashMap<Character, Integer> topLeftDiagonalMap;
    private HashMap<Character, Integer> topRightDiagonalMap;
    private HashMap<Character, Integer> cornerHashMap;
    private int size;

    public CheckWinnerUtil(int size) { // input
        this.size = size;
        rowHashMaps = new ArrayList<>();
        colHashMaps = new ArrayList<>();
        for(int i=0;i<size;i++){
            rowHashMaps.add(new HashMap<>());
            colHashMaps.add(new HashMap<>());
        }
        topLeftDiagonalMap = new HashMap<>();
        topRightDiagonalMap = new HashMap<>();
        cornerHashMap = new HashMap<>();
    }

    public Player checkWinner(Board board, Move currentMove){ // input
        // update row and col hashmaps
        char symbol = currentMove.getPlayer().getSymbol();
        int row = currentMove.getCell().getRow();
        int col = currentMove.getCell().getCol();

        HashMap<Character, Integer> rowHashMap = rowHashMaps.get(currentMove.getCell().getRow());
        HashMap<Character, Integer> colHashMap = colHashMaps.get(currentMove.getCell().getCol());

        //TODO :  can we update the below line using lambda and streams ?
        rowHashMap.put(symbol, rowHashMap.getOrDefault(symbol, 0) + 1);
        colHashMap.put(symbol, colHashMap.getOrDefault(symbol, 0) + 1);
        /*
        if(rowHashMap.containsKey(symbol)){
            rowHashMap.put(symbol, rowHashMap.get(symbol) + 1);
        } else {
            rowHashMap.put(symbol, 1);
        }
        */
        //update diagonal hashmaps
        if(row == col){
            topLeftDiagonalMap.put(symbol, topLeftDiagonalMap.getOrDefault(symbol, 0 ) + 1);
        }
        if((row + col) == (size - 1) ){
            topRightDiagonalMap.put(symbol, topRightDiagonalMap.getOrDefault(symbol, 0 ) + 1);
        }
        //update corner hashmap
        if((row == 0 || row == size-1 ) && (col == 0 || col == size-1)){
            cornerHashMap.put(symbol, cornerHashMap.getOrDefault(symbol, 0 ) + 1);
        }

        if(cornerHashMap.getOrDefault(symbol, 0) == 4
        || topLeftDiagonalMap.getOrDefault(symbol, 0) == size
        || topRightDiagonalMap.getOrDefault(symbol, 0) == size
        || rowHashMap.get(symbol) == size
        || colHashMap.get(symbol) == size){
            return currentMove.getPlayer();
        }
        // TODO : maintain count for invalid hashmaps, if it becomes == SIZE,
        // throw this exception
        if(checkDraw()){
            throw new GameDrawnException("No more winner possible");
        }
        return null;
    }

    private boolean checkDraw(){
        for(HashMap<Character, Integer> map : rowHashMaps){
            if(map.size() <= 1){
                return false;
            }
        }
        for(HashMap<Character, Integer> map : colHashMaps){
            if(map.size() <= 1){
                return false;
            }
        }
        if(topLeftDiagonalMap.size() <= 1
                || topRightDiagonalMap.size() <= 1
                || cornerHashMap.size() <= 1){
            return false;
        }

        return true;
    }
}

/*
            0   1   2   3
        0   _   X   Y   Z -> hC1                0,0 || 0,3 || 3,0 || 3,3
        1   _   Y   Z   _ -> hC2
        2   X   _   Y   _ -> hC3 -> size > 1
        3   Z   _   _   X -> hC4
           hR1 hR2 hR3 hR4

       Game -> everything -> board, list<player>, current player, current move

       need -> board, current move -> cell, player[symbol]


 */