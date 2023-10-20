package javaapplication21;

public class ajedrez {

    public static void main(String[] args) {
        // Crear una matriz 8x8 de caracteres
        char[][] matrix = new char[8][8];

        // Llenar la matriz con 'B' y 'N' alternados según la paridad de la suma de índices
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 'B';  // Asignar 'B' si la suma de índices es par CASILLAS BLANCAS
                } else {
                    matrix[i][j] = 'N';  // Asignar 'N' si la suma de índices es impar CASILLAS NEGRAS
                }
            }
        }

        // Imprimir el tablero de ajedrez
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(matrix[i][j] + " ");  // Imprimir cada elemento de la fila
            }
            System.out.println();  // Imprimir una nueva línea para la siguiente fila
        }
    }
}
