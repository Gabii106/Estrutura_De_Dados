import java.util.ArrayList;

public class ListaComArray {
    private Integer[] array;
    private boolean resizable;
    private int initialCapacity;
    private int counter;
    private final static int x = 10;
    //Sublinhado = final, Italico = static - no diagrama de classes
    //final = é uma constante, logo não pode ser alterada
    public ListaComArray(){
        //Inicializações
        //this - sobe o escopo/ vai para o escopo da classe
        this.initialCapacity = 10;
        this.array = new Integer[x];
        this.resizable = true;
        this.counter = 0;
    }
    public boolean add(Integer obj){
        if(counter == array.length){
            if (resizable == true){
                resizeArrayList();
            } else {
                return false;
            }
        }
        //Se chegou aqui - Vai ter espaço
        this.array[counter] = obj;
        counter++;
        return true;
    }

    private void resizeArrayList(){
        int tam = array.length + x;

        Integer novo[] = new Integer[tam];

        for(int i = 0; i < array.length; i++){ //Percorre as posições até o tamanho do vetor original
            novo[i] = array[i];
        }

        array = novo;
    }

    public Integer remove(int index){
        if(index < 0 || index >= counter){
            //Posição inválida
            return null;
        }
        //Posição válida
        Integer tmp = array[index];
        for (int i = index; i < counter-1; i++){
            array[i] = array[i+1];
        }
        array[counter-1] = null;
        counter--;
        return tmp;
    }

    public boolean removeFirt(Integer valor){
        for (int i = 0; i < counter; i++){
            if (array[i].equals(valor)){
                remove(i);
                return true;
            }
        }
        return false;
    }

    public Integer get(int index){
        if(index < 0 || index >= counter){
            //Parametro é inválido
            return null;
        }
        //Parametro/Posição é válido
        return array[index];
    }

    public void clear(){
        this.counter = 0;
        if(resizable){
            this.array = new Integer[initialCapacity];
        }
    }

    public Integer set(int index, Integer elemento){
        //Teste do indice passando por parametro
        if(index < 0 || index >= counter){
            return null;
        }
        Integer tpm = array[index];
        array[index] = elemento;
        return tpm;
    }

    public int size(){
        return this.counter;
    }

    public boolean isEmpty(){
        return counter == 0;
    }

    public boolean isFull(){
        if(!resizable){
            return counter == array.length;
        }
        return false;
    }

    public boolean contains(Integer elemento){
        for (int i = 0; i < counter; i++){
            if (array[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(Integer elemento){
        int posi = -1;
        for (int i = 0; i < counter; i++){
            if (array[i] == elemento){
                posi = i;
                return posi;
            }
        }
        return posi;
    }

    public int lastIndexOf(Integer elemento){
        int posi = -1;
        for (int i = counter-1; i >=0; i--){
            if (array[i] == elemento){
                posi = i;
                return posi;
            }
        }
        return posi;
    }

    public Integer[] toArray(){
        Integer[] vet = new Integer[counter];
        for (int i = 0; i < counter; i++){
            vet[i] = array[i];
        }
        return vet;
    }

    public String toString(){
        String elementos = "";
        for (int i = 0; i < counter; i++){
            elementos += array[i] + " ";
        }
        return elementos;
    }

}
