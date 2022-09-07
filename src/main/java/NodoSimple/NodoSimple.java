package NodoSimple;

public class NodoSimple {
    public int dato;
    public NodoSimple siguiente;
    public NodoSimple(int d){
        this.dato=d;
    }
    public NodoSimple(int d, NodoSimple s){
        dato=d;
        siguiente=s;
    }
}
