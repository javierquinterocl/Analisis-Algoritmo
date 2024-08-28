package matriz;

public class Matriz {
    
    public static void main(String[] args) {
        long inicio = System.nanoTime();
        int[][] mm = new int[100][100];
        int sizeM = mm.length;
        for (int i = 0; i < sizeM; i++) {
            for (int j = 0; j < sizeM; j++) {
                mm[i][j]  =(int)(Math.random() * 11);
                System.out.println("Valores de la matriz: "+ " Valor:"  +mm[i][j]);
            }
        }
        long fin = System.nanoTime();
        long tiempo = (fin - inicio);
        System.out.println("Tiempo de ejecución: " + tiempo + " nanosegundos");
    } 
}
