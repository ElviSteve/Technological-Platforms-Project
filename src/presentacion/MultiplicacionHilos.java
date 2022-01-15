package presentacion;

public class MultiplicacionHilos implements Multiplicacion {

    @Override
    public double[][] multiplicar(double[][] M, double[][] N) {
        int rows = M.length;
        int cols = N[0].length;
        double[][] result = new double[rows][cols];

        MulThread[][] resultado = new MulThread[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Crea un nuevo hilo 
                resultado[i][j] = new MulThread(N, M, i, j, result);
                resultado[i][j].start();
            }
        }
        //Esperar a que se termine de ejecutar todo
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                try {
                    resultado[i][j].join();
                } catch (InterruptedException e) {
                }
            }
        }
        return result;
    }
}
