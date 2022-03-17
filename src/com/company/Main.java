package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //lable game
        System.out.println("Chimdi's Tic-Tac-Toe-Game");

        //take players name
        Scanner scan = new Scanner(System.in);
       // System.out.println("Input player one's name");
        //String Player1 = scan.nextLine();
        //System.out.println("Input player two's name");
        //String PLayer2 = scan.nextLine();

        //calling class functions
        functionsfortictactoe test = new functionsfortictactoe();

        test.intializeBoard();

        do {
            test.printBoard();
            int row;
            int col;
            do {
                System.out.print("Player " +test.getCurrentPlayer()+ " please input an empty row and column to make a move");
                row = scan.nextInt() - 1;
                col = scan.nextInt() - 1;
            }
            while (!test.spaceFreeFill(row, col));
            test.checkPlayerTurnandSign();
        }
        while(!test.playerWon()&&!test.isfullBoard());
        if(test.isfullBoard()&&!test.playerWon()){
            System.out.print("WE HAVE A TIE");
        }else{
            test.printBoard();
            test.checkPlayerTurnandSign();
            System.out.println(test.getCurrentPlayer() + " Wins!");
        }





    }


}
