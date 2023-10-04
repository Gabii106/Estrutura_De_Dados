public class FilaComEncadeamento {
    private NoLista ini;
    private NoLista fim;

    public FilaComEncadeamento(){
        this.ini = null;
        this.fim = null;
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
        return true;
    }

    public Integer retirar(){
        if (ini == null) {
            return null;
        } else {
            Integer tpm = ini.getInfo();
            this.ini = this.ini.getProximo();
            return tpm;
        }
    }

    public boolean vazia(){
        return (this.ini == null);
    }

    public void libera(){
        this.ini = null;
        this.fim = null;
    }

    public int size(){
        int cont = 0;
        NoLista temp = ini;
        boolean control = true;
        if (ini != null) {
            while (control) {
                if (temp.getProximo() == null) {
                    control = false;
                }
                cont++;
                if (control) {
                    temp = temp.getProximo();
                }
            }
        }
        return cont;
    }
}
