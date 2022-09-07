package NodoSimple;

public class Lista {
    protected NodoSimple inicio,fin;
    public Lista(){
        inicio=null;
        fin=null;
    }
    public void agregarinicio(int elemento){
        inicio=new NodoSimple(elemento, inicio);
        if(fin==null){
            fin==inicio;
        }
    }
    public void mostrarLista(){
        NodoSimple recorrer=inicio;
        while (recorrer!=null){
            System.out.println("*"+recorrer.dato+"*");
            recorrer=recorrer.siguiente;

        }
    }
}
