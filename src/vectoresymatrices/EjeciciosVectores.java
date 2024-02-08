package vectoresymatrices;

import java.util.Scanner;

public class EjeciciosVectores {

    public static void main(String[] args) {
        /*Realizar un programa que permita cargar 15 num en un vector. Una vez cargados se necesita que el programa cuente e informe
        por pantalla cuantas veces se cargó el num 3*/
        System.out.println("Ejercicio 1: cuantas veces aparece el numero 3");

        int vector[] = new int[15];
        Scanner teclado = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el numero para la posicion: " + i);
            vector[i] = teclado.nextInt();

            if (vector[i] == 3) {
                contador = contador + 1;
            }
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("El numero ingresado en la posicion " + i + " es el: " + vector[i]);
            System.out.println("--------------------");
        }

        System.out.println("La cantidad de numero 3 ingresados fueron de: " + contador);

        System.out.println("---------------------------");
        System.out.println("Ejercicio 2: cargar notas y promedio");
        /*En una tabla de cuatro filas y 4 columnas se guardaron las notas de 4 alumnos de secundaria.
        Cada fila corresponde a las notas y al promedio de cada alumno. Se necesita un programa que permita 
        al profesor cargar, en las 3 posiciones de columnas de cada fila las notas del alumno y que en las 
        ultimas columnas se calcules los promedios. Una vez realizados los calculos, se desea mostrar las 3 notas
        de cada alumno y el promedio correspondiente recorriendo la matriz.*/

        Double matriz[][] = new Double[4][4];
        Scanner tec = new Scanner(System.in);
        Double suma = 0.0;

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la nota para el alumno " + f);
                matriz[f][c] = tec.nextDouble();
                suma = suma + matriz[f][c];
            }
            matriz[f][3] = suma / 3;
            suma = 0.0;
        }
        for (int f = 0; f < 4; f++) {
            System.out.println("Las notas del alumno " + f + " son: ");
            for (int c = 0; c < 3; c++) {
                System.out.println("Nota numero " + c + " es: " + matriz[f][c]);
            }
            System.out.println("El promedio del alumno es: " + matriz[f][3]);
        }

        System.out.println("---------------------------");
        System.out.println("Ejercicio 3: carga y recorrido de nombres");
        //cargar un vector con 8 nombres y mostrar los nombres en pantalla------------------------------------------------------------
        String vec[] = new String[8];

        vec[0] = "Alejandra";
        vec[1] = "Maria";
        vec[2] = "Lula";
        vec[3] = "Mari";
        vec[4] = "Ana";
        vec[5] = "Lucas";
        vec[6] = "Leo";
        vec[7] = "Juan";

        for (int i = 0; i < vec.length; i++) {
            System.out.println("El nombre de la posicion " + i + " es: " + vec[i]);
        }

        System.out.println("---------------------------");
        System.out.println("Ejercicio 4: Temperatura de ciudades");
        /*En tres vectores diferentes se guardan los nombres, temp min y max de 5 ciudades de la prov de misiones. En el primer vector
        se guardan los nombres de las ciudades, en el segundo las temp min y el tercero las maxs. Se necesita un programa que permita
        cargar los datos, ademas deberá informar por pantalla cual fue la ciudad con temp más baja y cual con la mas alta dando a
        conocer la cantidad de grados*/

        String ciudades[] = new String[3];
        Double tempMin[] = new Double[3];
        Double tempMax[] = new Double[3];
        Double min = 9999999.00;
        Double max = -9999999.00;
        int posMin = -1;
        int posMax = -1;
        Scanner tcld = new Scanner(System.in);

        for (int i = 0; i < ciudades.length; i++) {
            System.out.println("Ingrese el nombre para la ciudad " + i);
            ciudades[i] = tcld.next();
            System.out.println("Ingrese la temperatura minima " + i);
            tempMin[i] = tcld.nextDouble();
            System.out.println("Ingrese la temperatura maxima " + i);
            tempMax[i] = tcld.nextDouble();
        }

        for (int i = 0; i < ciudades.length; i++) {
            if (tempMin[i] < min) {
                min = tempMin[i];
                posMin = i;
            }
            if (tempMax[i] > max) {
                max = tempMax[i];
                posMax = i;
            }
        }

        System.out.println("La temperatura minima registrada es de: " + min);
        System.out.println("Se regristro en la ciudad de: " + ciudades[posMin]);
        System.out.println("La temperatura maxima registrada es de: " + max);
        System.out.println("Se regristro en la ciudad de: " + ciudades[posMax]);

        System.out.println("---------------------------");
        System.out.println("Ejercicio 6: Rellenar una matriz");
        //Rellenar una matriz de 4x5 de solo el numero cinco

        int mat[][] = new int[4][5];

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 5; c++) {
                mat[f][c] = 5;
            }
        }
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(mat[f][c]);
            }
            System.out.println("\n");
        }

        System.out.println("---------------------------");
        System.out.println("Ejercicio 7: aerolineas");

        int vuelo[][] = new int[4][3];
        Scanner tecla = new Scanner(System.in);
        Scanner tecla2 = new Scanner(System.in);
        int destino, horario, asientos;
        String out = "";

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de asientos para el vuelo " + f + " al horario " + c);
                vuelo[f][c] = tecla.nextInt();
            }
        }

        System.out.println("----Ventas:-----");

        while (!out.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el lugar de destino:");
            destino = tecla2.nextInt();
            System.out.println("Ingrese el horario del vuelo:");
            horario = tecla2.nextInt();
            System.out.println("Ingrese la cantidad de asientos que desea");
            asientos = tecla2.nextInt();

            if (destino >= 0 && destino <= 3) {
                if (horario >= 0 && horario <= 2) {
                    if (vuelo[destino][horario] >= asientos) {
                        System.out.println("Su reserva se realizo con exito");
                        vuelo[destino][horario] = vuelo[destino][horario] - asientos;
                    } else {
                        System.out.println("La cantidad de asientos deseados no esta disponible");
                    }
                } else {
                    System.out.println("El horario seleccionado es invalido. Es de 0 a 2.");
                }
            } else {
                System.out.println("El destino seleccionado es invalido. Es de 0 a 3.");
            }

            System.out.println("Desea seguir reservando? Ingrese finish para terminar o cualquier valor para seguir");
            out = tecla2.next();
        }

    }

}
