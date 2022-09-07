package NodoSimple;

import javax.swing.*;

public class MainSimple {
    Lista list=new Lista();
    int opcion=0,elem;
    do{
        try{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar un elemento al inicio\n2. Mostrar de la lista\n" +
                    "3. Salir","Menu opciones",3));
            switch (opcion){
                case 1:
                    brake;
                    try {
                    }
                        catch(NumberFormatException s) {
                            elem = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresar el elemento: ", 3));
                            list.Lista(elem);
                        }
                case 2:
                    list.mostrarLista();
                    break;
                case 3:
                    JOptionPane.showInputDialog(null, "opcion incorrecta");
                    break;
                default:
            }
        }
        catch(Exception e){
            JOptionPane.showInputDialog(null, "error" +e.getMessage());
        }
    }
        while(opcion!=3);
}

