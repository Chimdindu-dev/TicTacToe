package com.company;

public class functionsfortictactoe {
    static char[][] board ;
    static char currentPlayer;

    public static char getCurrentPlayer() {
        return currentPlayer;
    }

    public functionsfortictactoe() {
        board = new char[3][3];
        intializeBoard();
        currentPlayer = 'x';

    }

    public void intializeBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        System.out.println("-------");
        //itterate the board and fill with |
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                //board[i][j] = '-';
                System.out.print("|");
                System.out.print(board[i][j]);
                //System.out.print("|");

            }
            System.out.println("|");
            // System.out.println();
            System.out.println("-------");
        }
    }

    public boolean isfullBoard(){
        boolean full = true;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]=='-'){
                   full = false;
                }
            }}

        return full;
    }

    public void checkPlayerTurnandSign(){
        if(currentPlayer == 'x'){
            currentPlayer = 'o';
        }
        else {
            currentPlayer = 'x';
        }
    }

    public boolean spaceFreeFill(int row, int col){
        if((row<=2 && row>=0)&&(col<=2 && col>=0)) {
            if (board[row][col]=='-') {
                board[row][col] = currentPlayer;
                return true;
                //System.out.print("true");
            }
        }
        return false;
    }

    public boolean playerWon(){
        boolean aPlayerWon = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[0][0]==board[0][1] && board[0][0]==board[0][2] && board[0][0] != '-'){
                    aPlayerWon = true;
                }
                if (board[1][0]==board[1][1] && board[1][0]==board[1][2] && board[1][0] != '-'){
                    aPlayerWon = true;
                }
                if (board[2][0]==board[2][1] && board[2][0]==board[2][2] && board[2][0] != '-'){
                    aPlayerWon = true;
                }
                if (board[0][0]==board[1][0] && board[0][0]==board[2][0] && board[0][0] != '-'){
                    aPlayerWon = true;
                }
                if (board[0][1]==board[1][1] && board[0][1]==board[2][1] && board[0][1] != '-'){
                    aPlayerWon = true;
                }
                if (board[0][2]==board[1][2] && board[0][2]==board[2][2] && board[0][2] != '-'){
                    aPlayerWon = true;
                }
                if (board[0][0]==board[1][1] && board[0][0]==board[2][2] && board[0][0] != '-'){
                    aPlayerWon = true;
                }
                if (board[0][2]==board[1][1] && board[0][2]==board[2][0] && board[0][2] != '-'){
                    aPlayerWon = true;
                }

            }
            }
        return aPlayerWon;
    }

}
