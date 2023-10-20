package CALCULADORA4PLUSFACIL;

import java.util.Scanner;

public class calculadora4plusfacil {

    public static void main(String[] args) {
        
         System.out.println("Bienvenido a tu calculadora supermejorada con ARRAYS");
                double resultadofinalsuma = 0;
                double resultadofinalresta = 0;
                double resultadofinalmultiplicacion;      // DEFINIMOS VARIABLES CON DOUBLE.
                double resultadofinaldivision = 0;
                int size;
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("Introduce el tamaño del array");  //DETECTA EL TAMAÑO DEL ARRAY
                    size = teclado.nextInt();
                int[] array = new int[size];

                    for (int i = 0; i < size; i++) {
                    System.out.println("Introduce el valor de la posición " + i);
                    // DESDE LA POSICIÓN "0" HASTA LA "SIZE - 1" VA PIDIENDO VALORES POR CONSOLA PARA IR DEFINIENDO EL ARRAY
                    array[i] = teclado.nextInt();
        }// cierre del for
        int opcion = 0;
        do {
            int operacion;

            System.out.println("ESCOJA OPERACION 1(suma), 2(resta),3(multiplicacion),4(division),5(cambiar valores)");
            Scanner leer3 = new Scanner(System.in);
            operacion = leer3.nextInt();
            switch (operacion) {

                case 1:
                        for (int i = 0; i < size; i++) {
                        resultadofinalsuma += array[i]; // resultadofinalsuma = resultadofinalsuma + array[i]
                    } //cierre case
                    System.out.println("La suma final es " + resultadofinalsuma);
                    break;

                case 2:
                    resultadofinalresta = array[0];
                        for (int i = 1; i < size; i++) {
                        resultadofinalresta -= array[i];
                    } //cierre case
                    System.out.println("La resta final es " + resultadofinalresta);
                    break;

                case 3:
                     resultadofinalmultiplicacion = 1;
                         for (int i = 0; i < size; i++) {
                         resultadofinalmultiplicacion *= array[i];
                    } //cierre case
                    System.out.println("La multiplicación final es " + resultadofinalmultiplicacion);
                    break;

                case 4:
                    resultadofinaldivision = array[0];
                        for (int i = 1; i < size; i++) {
                        resultadofinaldivision /= array[i];
                    } //cierre case
                    System.out.println("La division final es " + resultadofinaldivision);
                    break;
               
                case 5:
                    for (int i = 0; i < size; i++) {
                        System.out.println("Introduce el valor de la posición " + i);
                        // DESDE LA POSICIÓN "0" HASTA LA "SIZE - 1" VA PIDIENDO VALORES POR CONSOLA PARA IR DEFINIENDO EL ARRAY
                        array[i] = teclado.nextInt();
                    } //cierre case
                    
                    break;
                default:
                    System.out.println("operación no valida");
            }//switch
         
                        if (operacion < 5) {   // esto lo hacemos para que no te vuelva a preguntar si quieres hacer otra operación al cambiar los valores del array.
                            System.out.println("Quiere hacer otra operacion?? 1 (si) 2 (no)");
                            Scanner leer8 = new Scanner(System.in);
                            opcion = leer8.nextInt();
                            } else {
                  opcion = 1; // Para que continúe pidiendo operaciones
            }
            
        } while (opcion == 1); //do-while
    }//cierre main

 }


