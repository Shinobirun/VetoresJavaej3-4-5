package JavaVec3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Se tienen tres vectores. En el primero de ellos se guarda un número de dni, en el segundo un
        // nombre y en el tercero un apellido. Se desea un programa que sea capaz de recorrer los tres
        // vectores AL MISMO TIEMPO y mostrar cada uno de estos datos por pantalla. Pista: tener en cuenta
        // que el índice de cada vector es correspondiente al índice de los demás, es decir, los datos
        // ontenidos en el índice cero del vector de dni, se corresponde con el índice cero del vector de
        // nombres y el de apellidos.

        System.out.println("Alumnos");


        int dni[] = {23451147, 40567643, 30456981};
        String name[] = {"Juan", "Ana", "Lucia"};
        String surname[] = {"Lopez", "Garcia", "Puerta"};

        for (int i = 0; i < 3; i++) {
            System.out.println("Se llama " + name[i] + " " + surname[i] + " y su DNI es: " + dni[i]);

        }

        //En un vector de 23 posiciones se tienen las temperaturas máximas de las capitales de las 23
        // provincias argentinas en el último mes. A partir de esta información, un noticiero desea determinar
        // el top 5 de las temperaturas más altas para poder mostrar en la pantalla de su programa, para ello
        // se necesita un programa que sea capaz de recorrer el vector de temperaturas, determinar las 5 más
        // altas y copiarlas en un nuevo vector de 5 posiciones

        System.out.println("5 temperaturas mas altas");

        Integer temp[] = {12, 23, 35, 41, 5, 8, 9, 10, 24, 14, 16, 27, 28, 32, 33, 36, 38, 42, 43, 20};

        Arrays.sort(temp, Collections.reverseOrder());


        System.out.println("Las 5 temperaturas maximas son: ");

        for (int i = 0; i < 5; i++) {
            System.out.println(temp[i]);

        }

        //   Se necesita un vector que permita cargar por teclado el nombre de 10 animales. A partir
        //   de esta carga, se desea otro vector que copie los mismos nombres pero en el orden inverso,
        //   es decir, si los nombres son: perro, gato, lagartija, el nuevo vector debe contener: lagartija,
        //   gato, perro. Una vez realizado el cambio, mostrar por pantalla ambos vectores para compararlos.

        System.out.println("Odenamiento de animales");

        String animales[] = new String[10];
        String animalesInver[] = new String[10];
        int xer=1;

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Ingrese animal numero " + xer + ":");
            animales[i] = teclado.next();
            xer++;
        }

        System.out.println("La lista de animales es la siguiente:");

        for (String mostrar : animales
        ) {
            System.out.println(mostrar);
        }


        int descontador = 9;

        for (String mostrar : animales) {
            animalesInver[descontador] = mostrar;
            descontador--;
        }
        System.out.println("El vector invertido es: ");

        for (String most : animalesInver) {
            System.out.println(most);


        }
    }
}