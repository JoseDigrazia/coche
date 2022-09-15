package com.example.coche;

import java . io . *;

public class Main{

    public static void main(String args[]) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System . in));

        String r;

        int incremPuer;

        incremPuer = 0;

        Coche miCoche = new Coche(incremPuer);

        do {

            do {

                System.out.print("agregar puerta al coche? (s/n): ");

                r = bufEntrada.readLine();

                r = r.toLowerCase();

            } while (!(r.equals("s") || r.equals("n")));

            if (r.equals("s")) {



                // crear objeto de clase coche
                incremPuer=miCoche.puertas(incremPuer);



                // Imprimir mensaje
                System.out.println("Número de puertas que tiene el objeto: "+incremPuer);

            }

        } while (!r.equals("n"));

    }

}

// clase Coche
class Coche {

    //Operaciones incremento de puertas
    int puertas;

    //Constructor para Coche
    Coche (int p) {

        puertas=p;

    }

    //Retornando valores
    int puertas(int incremPuer){

        return incremPuer+1;

    }

}