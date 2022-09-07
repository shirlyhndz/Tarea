package NodoDoble;

public class Nododoble {
    public int dato;
    Nododoble siguientee, anterior;

    public Nododoble(int ele) {
        this(ele, null, null);
    }

    public Nododoble(int ele, Nododoble s, Nododoble a) {
        dato = ele;
        siguientee = s;
        anterior = a;

    }
}

