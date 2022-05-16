import java.util.Scanner;

public class SumaMatrices {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int primeraMatriz[][] = new int[3][3];
        int segundaMatriz[][] = new int[3][3];
        int matrizResultadoSuma[][] = new int[3][3];

        // Llenamos la primera matriz
        System.out.println("Digite los elementos de la primera matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posicion [" + i + "][" + j + "] : ");
                primeraMatriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("");

        // Llenamos la segunda matriz
        System.out.println("Digite los elementos de la segunda matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Posicion [" + i + "][" + j + "] : ");
                segundaMatriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultadoSuma[i][j] = primeraMatriz[i][j] + segundaMatriz[i][j];
            }
        }

        // Suma de matrices
        System.out.println("la suma de las matrices es:");
        for (int i = 0; i < primeraMatriz.length; i++) {
            for (int j = 0; j < primeraMatriz.length; j++) {
                System.out.print(" [ " + primeraMatriz[i][j] + " ] ");
            }

            if (i == 1) {
                System.out.print("  +  ");
            } else {
                System.out.print("     ");
            }

            for (int j = 0; j < segundaMatriz.length; j++) {
                System.out.print(" [ " + segundaMatriz[i][j] + " ] ");
            }

            if (i == 1) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }

            for (int j = 0; j < matrizResultadoSuma.length; j++) {
                System.out.print(" [ " + matrizResultadoSuma[i][j] + " ] ");
            }

            System.out.println("    ");
        }

    }
}
