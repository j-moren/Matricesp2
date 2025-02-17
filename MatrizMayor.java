//Realice un algoritmo que llene una Matriz de 5*5 y determine la posición [Fila, Columna]

public class MatrizMayor {

    public static void main (String[] args) {

        Metodos metodos = new Metodos(); // Creamos instanncia de clase Metodos

        int [][] matriz = metodos.solicitarDimension(); // Solicitar Dimensiones de la Matriz

        metodos.llenarMatriz(matriz); // Llenar Matriz con Números Aleatorios

        metodos.ImprimirMatriz(matriz); // Imprimir la Matriz Generada

        String resultado = metodos.encontrarMayor(matriz); // Encontrar su numero Mayor y su posición
        System.out.println(resultado);

    }

}