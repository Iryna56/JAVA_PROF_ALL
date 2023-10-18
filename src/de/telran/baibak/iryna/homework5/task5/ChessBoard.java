package de.telran.baibak.iryna.homework5.task5;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chess = new String[8][8];
        chessBoardPrint(chess);
    }

    static void chessBoardPrint(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i + j) % 2 == 0)
                    array[i][j] = " ";
                else array[i][j] = "X";
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }
        }
    }

