/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gto.validor.sudoku.multithreading;

/**
 *
 * @author gtool
 */
public class ValidorSudokuMultithreading {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[][] sudoku = {
            {1,2,3,4,5,6,7,8,1},
            {2,5,6,4,5,6,7,8,2},
            {3,8,9,4,5,6,7,8,3},
            {4,2,3,4,5,6,7,8,4},
            {5,2,3,4,5,6,7,8,5},
            {6,2,3,4,5,6,7,8,6},
            {7,2,3,4,5,6,7,8,7},
            {8,2,3,4,5,6,7,8,8},
            {9,2,3,4,5,6,7,8,9},
        };
        Validator validator = new Validator(sudoku);
        
        System.out.println(validator.verifyCol(8));
    }
}
