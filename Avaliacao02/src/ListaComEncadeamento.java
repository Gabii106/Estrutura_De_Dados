public class ListaComEncadeamento {
    private NoLista first;
    private NoLista last;
    private int counter;

    public ListaComEncadeamento(){
        this.first = null;
        this.last = null;
        this.counter = 0;
    }

    public boolean addFirst(Integer obj) {
        NoLista no = new NoLista(obj, null);
        NoLista tmp = this.first;
        if (first == null) {
            this.first = no;
        } else {
            this.first = no;
            first.setNext(tmp);
        }
        counter++;
        return true;
    }

    public boolean addLast(Integer obj) {
        NoLista no = new NoLista(obj, null);
        if (first == null) {
            this.first = no;
        } else {
            last.setNext(no);
        }
        this.last = no;
        counter++; return true;
    }

    public int size(){
        return this.counter;
    }

    public void clear() {
        this.first = null;
        this.last = null;
        this.counter = 0;
    }
    @Override
    public String toString(){
        String texto = "";
        for (int i = 0; i< size(); i++){
            if(i == 0 && size() == 1){
                texto += "["+get(i) +"]";
            }
            else if(i == 0){
                texto += "["+get(i) + ", ";
            } else if (i == size()-1){
                texto += get(i) + "]";
            } else {
                texto += get(i) + ", ";
            }
        }
        if (size() == 0){
            texto += "[] - Situação em uma lista vazia, com 0 elementos";
        } else {
            texto += " - Situação em uma com "+size()+" elementos";
        }
        return texto;
    }

    public Integer get(int position){
        NoLista tmp = first;
        int cont = 0;
        if(position < 0 || position >= counter){
            return null;
        }else {
            while (cont < position) {
                tmp = tmp.getNext();
                cont++;
            }
        }
        return tmp.getInfo();
    }

    public boolean removeAll(Integer value){
        NoLista tmp = this.first;
        int count = 0;

        if(first != null){
            while (tmp.getNext() != null){
                if(tmp.getInfo() == value){
                    remove(count);
                    count--;
                }
                tmp = tmp.getNext();
                count++;
            }

            if (last.getNext() == null && last.getInfo() == value){
                remove(counter-1);
            }

            return true;
        }
            return false;
    }

    public void reverse(){
        Integer vetor[] = new Integer[size()];
        NoLista no = this.first;
        int j = 0;
        int a = 0;

        if (first != null){
            for (int i = size()-1; i>=0; i--){
                vetor[j] = get(i);
                j++;
            }

            while (no.getNext() != null){
                no.setInfo(vetor[a]);
                a++;
                no = no.getNext();
            }

            if (no.getNext() == null){
                no.setInfo(vetor[a]);;
            }
        }
    }

    private Integer remove(int index){
        NoLista tmp = this.first;
        NoLista retirado = null;
        NoLista tmpAnterior = null;
        int cont = 0;

        if(index < 0 || index >= this.counter){
            return null;
        } else if (index == 0) {
            retirado = first;
            first = first.getNext();
        } else {
            while (cont <= index) {
                if (cont == index){
                    retirado = tmp;
                } else {
                    tmpAnterior = tmp;
                    tmp = tmp.getNext();
                }
                cont++;
            }
        }
        if (tmpAnterior != null){
            tmpAnterior.setNext(retirado.getNext());
        }

        counter--;
        return retirado.getInfo();
    }


}
