package presentacion;

import javax.swing.JOptionPane;

public class MultiplicarMatrices {

    public double[][] calcular(double[][] M, double[][] N, double[][] result, int i, int j) {
        result[i][j] = 0.0;
        //Tiempo de espera de 5 segundos al multiplicar cada par fila/columna
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        for (int k = 0; k < M[0].length; k++) {
            result[i][j] += M[i][k] * N[k][j];
        }
        return result;
    }
}
