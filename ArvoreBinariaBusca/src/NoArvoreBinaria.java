public class NoArvoreBinaria {
    private int info;
    private NoArvoreBinaria esq;
    private NoArvoreBinaria dir;

    public NoArvoreBinaria(int info, NoArvoreBinaria esq, NoArvoreBinaria dir) {
        this.info = info;
        this.esq = esq;
        this.dir = dir;
    }
    public NoArvoreBinaria(int info) {
        this.info = info;
    }

    public int getInfo() { return info; }
    public void setInfo(int info) { this.info = info; }
    public NoArvoreBinaria getEsq() { return esq; }
    public void setEsq(NoArvoreBinaria esq) { this.esq = esq; }
    public NoArvoreBinaria getDir() { return dir; }
    public void setDir(NoArvoreBinaria dir) { this.dir = dir; }
    public String toString() {
        return "No árvore com informação de " + this.getInfo();
    }
}
