/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gto.validor.sudoku.multithreading;

/**
 *
 * @author gtool
 */
public class ThreadColumn extends Thread {
    private int index;
    private Validator game;
    
    public ThreadColumn(int index, Validator validator) {
        if(index < 0 || index > 8)
            throw new Error("O index a ser validado deve estar no intervalo 0-8");
        this.index = index;
        this.game = validator;
    }
    
    @Override
    public void run() {
        if(!this.game.verifyCol(index)) {
            throw new Error("A coluna " + (index + 1) + " não é válida");
        } else {
            System.out.println("A coluna " + (index + 1) + " é válida");
        }
    }
}
