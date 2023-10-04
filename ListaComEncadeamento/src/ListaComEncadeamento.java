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

    public Integer remove(int index){
        NoLista tmp = this.primeiro;
        NoLista retirado = null;
        NoLista tmpAnterior = null;
        int cont = 0;

        if(index < 0 || index >= this.contador){
            return null;
        } else if (index == 0) {
            retirado = primeiro;
            primeiro = primeiro.getProximo();
        } else {
            while (cont <= index) {
                if (cont == index){
                    retirado = tmp;
                } else {
                    tmpAnterior = tmp;
                    tmp = tmp.getProximo();
                }
                cont++;
            }
        }
        if (tmpAnterior != null){
            tmpAnterior.setProximo(retirado.getProximo());
        }

        contador--;
        return retirado.getInfo();

    }

    public boolean removeFirst(Integer valor){
        if(!contains(valor)){
            return false;
        } else {
            remove(indexOf(valor));
        }
        return true;
    }

    public Integer get(int index){
        NoLista tmp = primeiro;
        int cont = 0;
        if(index < 0 || index >= contador){
            return null;
        }else {
            while (cont < index) {
                tmp = tmp.getProximo();
                cont++;
            }
        }
        return tmp.getInfo();
    }

    public Integer set(int index, Integer valor){
        NoLista tmp = primeiro;
        NoLista guardar;
        int cont = 0;
        if(index < 0 || index >= contador){
            return null;
        }else {
            while (cont < index) {
                tmp = tmp.getProximo();
                cont++;
            }
            guardar = tmp;
            tmp.setInfo(valor);
        }
        return guardar.getInfo();
    }

    public boolean contains(Integer valor){
        NoLista tmp = primeiro;
        int cont = 0;

        while (cont < contador) {
            if (tmp.getInfo() == valor){
                return true;
            }
            tmp = tmp.getProximo();
            cont++;
        }
        return false;
    }

    public int indexOf(Integer valor){
        NoLista tmp = primeiro;
        int cont = 0;
        while (cont < contador) {
            if (tmp.getInfo() == valor){
                return cont;
            }
            tmp = tmp.getProximo();
            cont++;
        }
        return -1;
    }

    public int lastIndexOf(Integer valor){
        NoLista tmp = primeiro;
        int cont = 0;
        int ultimo = 0;
        while (cont < contador) {
            if (tmp.getInfo() == valor){
                ultimo = cont;
            }
            tmp = tmp.getProximo();
            cont++;
        }
        if(contains(valor)){
            return ultimo;
        }
        return -1;
    }

    public String toString(){
        String texto = "";
        for(int i =0; i < contador; i++){
            if (i == (contador-1)){
                texto += get(i);
            } else {
                texto += get(i)+ ", ";
            }
        }
        return texto;
    }

    public Integer[] toArray(){
        Integer[] vetor = new Integer[contador];
        for(int a = 0; a < contador; a++){
            vetor[a] = get(a);
        }
        return vetor;
    }

}
