public class ListaComEncadeamento {
    private NoLista primeiro;
    private NoLista ultimo;
    private int contador;

    public ListaComEncadeamento(){
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }

    public boolean add(Integer valor) {
        NoLista no = new NoLista(valor, null);
        if (primeiro == null) {
            this.primeiro = no;
        } else {
            ultimo.setProximo(no);
        }
        this.ultimo = no;
        contador++; return true;
    }

    public int size(){
        return this.contador;
    }
    public boolean isEmpty() {
        return (this.primeiro == null);
    }

    public void clear() {
        this.primeiro = null;
        this.ultimo = null;
        this.contador = 0;
    }
}
