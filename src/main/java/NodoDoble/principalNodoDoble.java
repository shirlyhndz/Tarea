package NodoDoble;

import javax.swing.*;

public class principalNodoDoble {
    public static void main(String []args){
        Listadoble lista= new Listadoble();
        int opcion=0,elemnto;
        do{
            try {
                elemnto = Integer.parseInt(JOptionPane.showInputDialog(null, "1.agregar nodo al inicio\n"
                        + "2. Agregar nodo al final\n" + "3. Mostrar lista de inicio a fin\n" + "4.mostrar lista de fina a incio\n"
                        + "5.salir\n" + "Menu de opciones", JOptionPane.INFORMATION_MESSAGE));
            switch (opcion){
                case 1:
                    elemnto=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresar el elemnto del nodo","agregando el nodo al principio", JOptionPane.INFORMATION_MESSAGE));
                    Listadoble.agregarAlinicio(elemnto);
                    break;
                case 2:
                    elemnto=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresar el elemnto del nodo","agregando el nodo al final", JOptionPane.INFORMATION_MESSAGE));
                    Listadoble.agregarAlFinal(elemnto);
                    break;
                case 3:
                    if(!lista.estVacia()){
                        lista.MostrarListaInicioFin();
                    }else {
                        JOptionPane.showMessageDialog(null,"No existe nodo aún","vacía",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 4:
                    if(!lista.estVacia()){
                        lista.MostrarListaFinInicio();
                    }else {
                        JOptionPane.showMessageDialog(null,"No existe nodo aún","vacía",JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"aplicacion finalizada","fin",JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"No esta en el menu","error",JOptionPane.INFORMATION_MESSAGE);

            }
            }catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(null, "errror"+n.getMessage());
                }
            }
            while (opcion!=5);
        }
    }

