/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gto.validor.sudoku.multithreading;

/**
 *
 * @author gtool
 */
public class ThreadSector extends Thread {
    private int index;
    private Validator game;
    
    public ThreadSector(int index, Validator validator) {
        if(index < 0 || index > 8)
            throw new Error("O index a ser validado deve estar no intervalo 0-8");
        this.index = index;
        this.game = validator;
    }
    
    @Override
    public void run() {
        if(!this.game.verifySector(index)) {
            throw new Error("O setor " + (index + 1) + " não é válido");
        } else {
            System.out.println("O setor " + (index + 1) + " é válido");
        }
    }
}
