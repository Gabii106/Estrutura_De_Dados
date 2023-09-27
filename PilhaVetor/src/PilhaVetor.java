public class PilhaVetor {
    private int n;
    private int tam = 5;
    private Integer[] vet = new Integer[tam];

    public boolean push(Integer v){
        if(n < tam){
            vet[n] = v;
            n++;
            return true;
        } else {
            return false;
        }
    }

    public Integer pop(){
        if(n == 0){
            return null;
        } else {
            Integer tmp = vet[n-1];
            n--;
            return tmp;
        }
    }

    public boolean vazia(){
        if(n == 0){
            return true;
        } else {
            return false;
        }
    }

    public void libera(){
        n = 0;
    }

    public int size(){
        return this.n;
    }
}
