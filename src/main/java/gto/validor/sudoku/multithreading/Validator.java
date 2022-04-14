/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gto.validor.sudoku.multithreading;

import java.util.Arrays;

/**
 *
 * @author gtool
 */
public class Validator {
    
    private int[][] board;    
    private int grid_size;
    
    public Validator(int[][] board) {

        int rows = board.length;
        int cols = board[0].length;
        if(rows != cols || rows != 9) {
            throw new Error("O Tabuleiro deve ser 9x9");
        }
         
       this.board = board;
       this.grid_size = rows;
    }
    
    public boolean verifyRow(int index) {
        return verify(board[index]);
    }
    
    public boolean verifyCol(int index) {
        int[] column = getColumn(index);
        return verify(column);
    }
    
    public boolean verifySector(int index) {
        int[] sector = getSector(index);
        return verify(sector);
    }
    
    
    private boolean verify(int[] argument) {
        int flag = 0;
        for(int i = 1; i <= grid_size; i++) {
            for(int element: argument) {
                if(element == i){
                    flag++;
                    break;
                }
            }
        }
        return flag == 9;
    }
    
    private int[] getColumn(int index) {
        int[] column = new int[grid_size];
        for(int i = 0; i< grid_size; i++) {
            column[i] = board[i][index];
        }
        return column;
    }
    
    private int[] getSector(int index) {
        int lastRow;
        int lastColumn;
        switch(index) {
            case 0:
                lastRow = 2;
                lastColumn = 2;
                break;
            case 1:
                lastRow = 2;
                lastColumn = 5;
                break;
            case 2:
                lastRow = 2;
                lastColumn = 8;
                break;
            case 3:
                lastRow = 5;
                lastColumn = 2;
                break;
            case 4:
                lastRow = 5;
                lastColumn = 5;
                break;
            case 5:
                lastRow = 5;
                lastColumn = 8;
                break;
            case 6:
                lastRow = 8;
                lastColumn = 2;
                break;
            case 7:
                lastRow = 8;
                lastColumn = 5;
                break;
            case 8:
                lastRow = 8;
                lastColumn = 8;
                break;
            default:
                throw new Error("Index inválido");
        }
        int[] sector = new int[grid_size];
        int sectorIndex = 0;
        for(int i = lastRow - 2; i <= lastRow; i++) {
            for (int j = lastColumn - 2; j <= lastColumn; j++) {
                sector[sectorIndex] = board[i][j];
                sectorIndex++;
            }
        }
        return sector;
    }
    
}
