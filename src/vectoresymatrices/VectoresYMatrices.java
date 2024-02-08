package vectoresymatrices;

import java.util.Scanner;

public class VectoresYMatrices {

    public static void main(String[] args) {
        
        System.out.println("ARRAYS");
        System.out.println("Vectores manuales");
        //creación de array tipo vector
        
        int vector [] = new int[4];
        
        //asignación manual
        
        vector[0] = 2;
        vector[1] = 22;
        vector[2] = 12;
        vector[3] = 42;
        
        //Recorrido con for
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado un: " + vector[i]);
            System.out.println("-------------------------");
        }
        
        System.out.println("-------------------------------");
        System.out.println("Vector con Scanner");
        
        int vec [] = new int[4];
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Ingrese un numero para el indice: " + i);
            vec [i] = teclado.nextInt();
        }
        
        for (int i = 0; i < vec.length; i++) {
            System.out.println("Estoy en el indice: " + i);
            System.out.println("Tengo guardado un: " + vec[i]);
            System.out.println("-------------------------");
            
        }
        
        System.out.println("-------------------------------");
        System.out.println("Matrices manuales:");
        
        int matriz [][] = new int [3] [3];
        
        matriz[0] [0] = 5;
        matriz[0] [1] = 15;
        matriz[0] [2] = 25;
        matriz[1] [0] = 3;
        matriz[1] [1] = 13;
        matriz[1] [2] = 23;
        matriz[2] [0] = 1;
        matriz[2] [1] = 11;
        matriz[2] [2] = 21;
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posición f: " + f + " c: " + c);
                System.out.println("Es de: " + matriz [f] [c]);
            }   
        }
        
        System.out.println("-------------------------------");
        System.out.println("Matrices con scanner:");
        
        int mat [][] = new int [3] [3];
        Scanner tcld = new Scanner(System.in);
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posición f: " + f + " c: " + c);
                mat [f][c] = tcld.nextInt();
            }   
        }
        
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("El valor de la posición f: " + f + " c: " + c);
                System.out.println("Es de: " + mat [f] [c]);
            }   
        }
        
    }
    
}
