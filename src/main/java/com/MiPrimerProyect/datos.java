package com.MiPrimerProyect;

import javax.swing.*;
import java.util.Scanner;


public class datos {

    //Forma de impresion numero uno usando Scanner para imprimir en la terminal
    /*public static void main(String[] args) {

        Scanner datos = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = datos.nextLine();

        System.out.println("Ingrese su Numero celular ");
        String numeroCelular = datos.nextLine();

        System.out.println("Ingrese su edad ");
        String edad = datos.nextLine();


        System.out.println("Bienvenido señor " + nombre + " es un placer para nosotros contar con una persona de " + edad + " años de edad.\nPróximamente nos comunicaremos con usted al numero celular " + numeroCelular + "\nfeliz dia");
    }*/



    //Forma numero 2 de imprimir usando JOptionPane
    public static void main(String[] args) {

        String nombre;
        String numeroCelular;
        String edad;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre ");
        numeroCelular = JOptionPane.showInputDialog("Ingrese su numero celular");
        edad = JOptionPane.showInputDialog("Ingrese su edad");

        JOptionPane.showMessageDialog(null, " Bienvenido senor " + nombre + " es un placer para nosotros contar con una persona de " + edad + " a#os de edad.\n" + " Proximamente nos comunicaremos con usted al numero " + numeroCelular + "\nFeliz dia");

    }
}
