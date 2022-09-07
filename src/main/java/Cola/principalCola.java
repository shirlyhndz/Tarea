package Cola;

import javax.swing.*;

public class principalCola {

    public static void main(String[]args){
        int opcion=0,elemento=0;
        Cola colas=new Cola();
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Inserte elemento en la cola\n"
                +"2. Quitar un elemento de la cola\n"+"3. ¿Esta vacía?\n"+"4. Elemnto al inicio de la cola\n"+"5.tamaño cola\n"+"6. Salir","Menu de colas",JOptionPane.QUESTION_MESSAGE));
                switch (opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresar el elemento","inertando la cola",JOptionPane.QUESTION_MESSAGE));
                        colas.insertar(elemento);
                        break;
                    case 2:
                        if(!colas.estaVacia()){
                            JOptionPane.showMessageDialog(null,"elemento es "+ colas.quitar(),"quitando elemento de la cola",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"la cola esta vacía ","Cola vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(colas.estaVacia()){
                            JOptionPane.showMessageDialog(null,"la cola no esta vacía ","Cola no vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!colas.estaVacia()){
                            JOptionPane.showMessageDialog(null,"elemento ubicado al incio es"+colas.iniciocola(),"Cola vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"la cola esta vacía ","Cola vacía",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"el tamaño es "+colas.tamañoCola(),"Cola vacía",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null,"cola finalizada ","fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"opción incorrecta ","cuidado!",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null,"error"+n.getMessage());
            }
        }
        while (opcion!=5);
    }
}
