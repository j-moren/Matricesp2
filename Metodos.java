
import java.util.Random;
import java.util.Scanner;

public class Metodos {

    public int[][] solicitarDimension() {
        Scanner sc = new Scanner (System.in); // Crear un objeto Scanner para leer la entrada

        System.out.println("Ingrese el Númer de Filas de la Matriz: "); // Solicitar el Número de Filas 
        int i = sc.nextInt(); // Lee el Número de Filas

        System.out.println("Ingrese el Número de Columnas: "); // Solicitar el Número de Columnas
        int j = sc.nextInt(); // Lee el Número de Columnas

        int[][] matriz = new int[i][j]; // Crear Matriz con las Dimensiones Ingresadas

        return matriz;
    
    }
    public void  llenarMatriz(int [][] matriz) {
        Random rand = new Random(); // Llenar Matriz con Valores aleatorios entre 0 y 100

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(100 + 1); // Genera Números entre 0 y 100
                
            }
            
        }
    }
    public String encontrarMayor(int[][] matriz) {
        int mayor = matriz[0][0];
        int filaMayor = 0;
        int columnaMayor = 0; // Metodo para encontrar el Número Mayor en la Matriz

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            if  (matriz[i][j] > mayor) {
                mayor = matriz[i][j]; // Encontramos el mayor Número
                filaMayor = i;
                columnaMayor = j;
            } 
            }
        }
        return "El Número Mayor es" + mayor + "y está en la posición ["+ filaMayor +"," +columnaMayor+"]";
    }
    public void ImprimirMatriz (int[][] matriz) {
        System.out.println("Matriz Generada: ");// Metodo pra Imprimir la Matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]+"\t ");                
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}
