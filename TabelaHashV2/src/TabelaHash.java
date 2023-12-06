public class TabelaHash<T> {
    private Object array[];
    private int contador;

    public TabelaHash() {
        this(13);
    }

    public TabelaHash(int tamanho) {
        array = (Object[]) new ListaComEncadeamento[tamanho];

        for(int i = 0; i < array.length; i++){
            array[i] = new ListaComEncadeamento<>(); //Inicializando uma lista encadeada para cada item
        }
    }

    private int hash(int chave) {
        return (chave % array.length);
    }

    public void insere(T obj) {
        int h = hash(obj.hashCode());

        ((ListaComEncadeamento<T>)array[h]).add(obj);
        contador++;
    }

    public void remove(T obj){
        int h = hash(obj.hashCode());

        ((ListaComEncadeamento<T>)array[h]).remove(obj);
        contador--;
    }

    public void imprime() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Indice: " + i + " = ");
            if (array[i] != null) {
                System.out.println(array[i]);
                } else {
                System.out.println("null");
            }
        }
    }
}
