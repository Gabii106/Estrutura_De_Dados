public class NoLista { //NóLista
    private Integer info;
    private NoLista proximo;

    public NoLista(){ //Construtor padrão
        proximo = null;
        info = null;
    }
    public NoLista(Integer valor, NoLista no){
        this.info = valor;
        this.proximo = no;
    }
    public Integer getInfo() {
        return info;
    }
    public void setInfo(Integer info) {
        this.info = info;
    }
    public NoLista getProximo() {
        return proximo;
    }
    public void setProximo(NoLista proximo) {
        this.proximo = proximo;
    }
}
