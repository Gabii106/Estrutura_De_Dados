public class FilaComEncadeamento {
    private NoLista ini;
    private NoLista fim;
    private int contador;

    public FilaComEncadeamento(){
        this.ini = null;
        this.fim = null;
        this.contador = 0;
    }

    public boolean inserir(Integer valor){
        NoLista no = new NoLista();
        no.setInfo(valor);
        if (ini == null) {
            //Cenário 1: Fila vazia
            this.ini = no;
        } else {
            //Cenário 2: Fila com elementos
            fim.setProximo(no);
        }
        this.fim = no;
        contador++;
        return true;
    }

    public Integer retirar(){
        if (ini == null) {
            return null;
        } else {
            Integer tpm = ini.getInfo();
            this.ini = this.ini.getProximo();
            contador--;
            return tpm;
        }
    }

    public boolean vazia(){
        return (this.ini == null);
    }

    public void liberar(){
        this.ini = null;
        this.fim = null;
        this.contador = 0;
    }

    public int size(){
        return this.contador;
    }
}
