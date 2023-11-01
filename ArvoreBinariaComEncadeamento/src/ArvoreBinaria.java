public class ArvoreBinaria {
    private NoArvoreBinaria raiz;

    public ArvoreBinaria() {
        raiz = null;
    }
    public NoArvoreBinaria insere(Integer valor, NoArvoreBinaria esq, NoArvoreBinaria dir){
        NoArvoreBinaria no = new NoArvoreBinaria(valor, esq, dir);
        raiz = no;
        return no;
    }

    @Override
    public  String toString(){
        return toStringPos(raiz);
    }

    private String toStringPos(NoArvoreBinaria no){
        String s = "";
        if(no != null){
            s += toStringPos(no.getEsq());
            s += toStringPos(no.getDir());
            s += no.getInfo() + " ";
        }
        return s;
    }

    public boolean pertence(Integer valor){
        return pertence(raiz, valor);
    }

    private boolean pertence(NoArvoreBinaria no, Integer valor){
        if(no == null){
            return false;
        }

        //Navega tudo
        boolean expressao = no.getInfo().equals(valor) ||
                pertence(no.getEsq(), valor) ||
                pertence(no.getDir(), valor) ;

        return expressao;

        //boolean expr = no.getInfo().equals(valor); //Para de navegar quando acha
        //if(!expr){
        //    expr = expr || pertence(no.getEsq(), valor);
        //}

        //if(!expr){
        //   expr = expr || pertence(no.getDir(), valor);
        //}

       // return expr;

    }
}
