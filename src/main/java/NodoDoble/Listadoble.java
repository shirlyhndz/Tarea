package NodoDoble;

import javax.swing.*;

public class Listadoble {
    private Nododoble inicio, fin;

    public Listadoble() {
        inicio = fin = null;
    }

    public boolean estVacia() {
        return inicio == null;
    }

    public static void agregarAlFinal(int ele) {
        if (!estVacia()) {
            fin = new Nododoble(ele, null, fin);
            fin.anterior.siguientee = fin;
        } else {
            inicio = fin = new Nododoble(ele);
        }
    }

    public static void agregarAlinicio(int ele) {
        if (!estVacia()) {
            inicio = new Nododoble(ele, inicio, null);
            inicio.siguientee.anterior = inicio;
        } else {
            inicio = fin = new Nododoble(ele);
        }
    }

    public void MostrarListaInicioFin(){
        if (!estVacia()) {
            String daatos = "==";
            Nododoble auxiliar = inicio;
            while (auxiliar != null) {
                daatos = daatos + "[" + auxiliar.dato + "]";
                auxiliar = auxiliar.siguientee;
            }
            JOptionPane.showMessageDialog(null, daatos, "mostrando lista de inicio a fin", JOptionPane.INFORMATION_MESSAGE);
        }
    }

        public void MostrarListaFinInicio(){
            if (!estVacia()) {
                String daatos = "==";
                Nododoble auxiliar = fin;
                while (auxiliar != null) {
                    daatos = daatos + "[" + auxiliar.dato + "]";
                    auxiliar = auxiliar.anterior;
                }
                JOptionPane.showMessageDialog(null, daatos, "mostrando lista de inicio a fin", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }


