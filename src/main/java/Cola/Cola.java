package Cola;

public class Cola {
    claseCola inicio,fin;
    int tamaño;
    public Cola(){
        inicio=fin=null;
        tamaño=0;
    }
    public boolean estaVacia(){
        return inicio==null;
    }
    public void insertar(int elemento){
        claseCola nuevo=new claseCola(elemento);
        if(estaVacia()){
            inicio=nuevo;
        }
        else{
            fin.siguiente=nuevo;
        }
        fin=nuevo;
        tamaño++;
    }
    public int quitar(){
        int auxiliar=inicio.dato;
        inicio=inicio.siguiente;
        tamaño--;
        return auxiliar;
    }
    public int iniciocola(){
      return inicio.dato;
    }
    public int tamañoCola(){
        return tamaño;
    }
}
