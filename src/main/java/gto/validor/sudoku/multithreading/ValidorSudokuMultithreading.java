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
        int[][] sudoku = {
            {5,6,7,3,2,4,8,9,1},
            {1,3,9,7,6,8,2,5,4},
            {2,4,8,9,5,1,3,7,6},
            {4,8,2,5,1,9,6,3,7},
            {7,9,5,4,3,6,1,8,2},
            {3,1,6,2,8,7,9,4,5},
            {8,7,4,1,9,2,5,6,3},
            {6,2,3,8,7,5,4,1,9},
            {9,5,1,6,4,3,7,2,8},
        };
        Validator validator = new Validator(sudoku);
        ThreadColumn columnValidator0 = new ThreadColumn(0, validator);
        ThreadColumn columnValidator1 = new ThreadColumn(1, validator);
        ThreadColumn columnValidator2 = new ThreadColumn(2, validator);
        ThreadColumn columnValidator3 = new ThreadColumn(3, validator);
        ThreadColumn columnValidator4 = new ThreadColumn(4, validator);
        ThreadColumn columnValidator5 = new ThreadColumn(5, validator);
        ThreadColumn columnValidator6 = new ThreadColumn(6, validator);
        ThreadColumn columnValidator7 = new ThreadColumn(7, validator);
        ThreadColumn columnValidator8 = new ThreadColumn(8, validator);
        
        ThreadRow rowValidator0 = new ThreadRow(0, validator);
        ThreadRow rowValidator1 = new ThreadRow(1, validator);
        ThreadRow rowValidator2 = new ThreadRow(2, validator);
        ThreadRow rowValidator3 = new ThreadRow(3, validator);
        ThreadRow rowValidator4 = new ThreadRow(4, validator);
        ThreadRow rowValidator5 = new ThreadRow(5, validator);
        ThreadRow rowValidator6 = new ThreadRow(6, validator);
        ThreadRow rowValidator7 = new ThreadRow(7, validator);
        ThreadRow rowValidator8 = new ThreadRow(8, validator);     
        
        ThreadSector sectorValidator0 = new ThreadSector(0, validator);
        ThreadSector sectorValidator1 = new ThreadSector(1, validator);
        ThreadSector sectorValidator2 = new ThreadSector(2, validator);
        ThreadSector sectorValidator3 = new ThreadSector(3, validator);
        ThreadSector sectorValidator4 = new ThreadSector(4, validator);
        ThreadSector sectorValidator5 = new ThreadSector(5, validator);
        ThreadSector sectorValidator6 = new ThreadSector(6, validator);
        ThreadSector sectorValidator7 = new ThreadSector(7, validator);
        ThreadSector sectorValidator8 = new ThreadSector(8, validator);
        
        columnValidator0.start();
        columnValidator1.start();
        columnValidator2.start();
        columnValidator3.start();
        columnValidator4.start();
        columnValidator5.start();
        columnValidator6.start();
        columnValidator7.start();
        columnValidator8.start();
        
        rowValidator0.start();
        rowValidator1.start();
        rowValidator2.start();
        rowValidator3.start();
        rowValidator4.start();
        rowValidator5.start();
        rowValidator6.start();
        rowValidator7.start();
        rowValidator8.start();
        
        sectorValidator0.start();
        sectorValidator1.start();
        sectorValidator2.start();
        sectorValidator3.start();
        sectorValidator4.start();
        sectorValidator5.start();
        sectorValidator6.start();
        sectorValidator7.start();
        sectorValidator8.start();
    }
}
