package Pila;

public class Pilas {
    int vectorPilas[];
    int cima;

    public Pilas (int tamaño){
        vectorPilas=new int[tamaño];
        cima=0;
    }
    public void Insertar(int dato){
        vectorPilas[cima]=dato;
        cima++;
    }
    public int Eliminar(){
        int eliminar=0;
        if (cima==0){
            System.out.println("pila vacía");
        }
        else {
            eliminar=vectorPilas[cima];
            cima--;
        }
        return eliminar;
    }
    public boolean vacio(){
        if (cima==0){
            return true;
        }
        else{
            return false;
        }
    }
    public int tamaño(){
        return vectorPilas.length-1;
    }

}
