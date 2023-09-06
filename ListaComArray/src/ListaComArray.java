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
        this.resizable = false;
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
    //public boolean add(int index, Integer obj){
        //return true;
    //}

    public int size(){
        return this.counter;
    }

    public Integer get(int index){
        if(index < 0 || index >= counter){
            //Parametro é inválido
            return null;
        }
        //Parametro/Posição é válido
        return array[index];
    }

    private void resizeArrayList(){

    }

    public boolean isEmpty(){
        return counter == 0;
    }

    public String toString(){
        String elementos = "";

        for (int i = 0; i < counter; i++){
            elementos += array[i] + " ";
        }

        return elementos;
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

    public boolean isFull(){
        if(resizable == false && counter == array.length){
            return true;
        }
        return false;
    }

    public boolean contains(Integer elemento){
        for (int i = 0; i < counter; i++){
            if (array[i] == elemento) {
                return true;
            }
        }
        return false;
    }

}
