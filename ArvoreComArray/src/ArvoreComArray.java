public class ArvoreComArray { //Árvore Binária
    private int h;
    private Integer array[];

    public ArvoreComArray(int h){
        this.h = h;
        this.array = new Integer[getMaxQt()];
    }

    public int getMaxQt(){
        return  (int) (Math.pow(2, this.h+1) - 1);
    }

    public boolean insere(Integer v){
        return false;
    }
}
