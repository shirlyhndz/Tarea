package Pila;

import java.util.Scanner;

public class clasepilas {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Pila");
        System.out.println("colocar tamao de pila");

        int tamaño=sc.nextInt();
        int dato=0, opc=0;
        Pilas a =new Pilas(tamaño);
        do{
            System.out.println("Que desea hacer");
            System.out.println("1. ingresar dato   2.eliminar dato   3.¿esta vacía?");
            System.out.println("4.tamaña de pila    5. salir");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("ingresar dato:");
                    a.Insertar(dato=sc.nextInt());
                    System.out.println("Dato insertado");
                    System.out.println("");
                    break;
                case 2:
                    a.Eliminar();
                    break;
                case 3:
                    System.out.println(a.vacio());
                    System.out.println("");
                    break;
                case 4:
                    System.out.println(a.tamaño());
                    break;
            }

        }
        while (opc!=5);
    }
}
