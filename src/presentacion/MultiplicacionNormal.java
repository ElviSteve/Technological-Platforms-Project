
package presentacion;


public class MultiplicacionNormal implements Multiplicacion{

     @Override
    public double[][] multiplicar(double[][] M, double[][] N) {
        MultiplicarMatrices x = new MultiplicarMatrices();
        double [][]resultado = new double [M.length][N[0].length];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                   resultado = x.calcular(M, N, resultado, i, j);
            }
        }
        return resultado;
    }
    
}
