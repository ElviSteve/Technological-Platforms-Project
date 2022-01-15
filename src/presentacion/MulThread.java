/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

/**
 *
 * 
 */
public class MulThread extends Thread{
    private double[][] N;
    private double[][] M;
    private int fila;
    private int columna;
    private double[][] result;
        
    @Override
    public void run(){
        MultiplicarMatrices matriz = new MultiplicarMatrices();
        result = matriz.calcular(this.M, this.N, this.result, this.fila, this.columna);
    }

    public MulThread(double[][] N, double[][] M, int fila, int columna, double[][] result) {
        super();
        this.N = N;
        this.M = M;
        this.fila = fila;
        this.columna = columna;
        this.result = result;
    }

    public double[][] getResult() {
        return result;
    }

    public void setResult(double[][] result) {
        this.result = result;
    }    
}
