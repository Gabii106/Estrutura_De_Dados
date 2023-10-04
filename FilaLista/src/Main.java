public class Main {
    public static void main(String[] args) {
        FilaComEncadeamento fila = new FilaComEncadeamento();

        System.out.println(fila.vazia());

        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);
        fila.inserir(4);

        System.out.println(fila.vazia());
        System.out.println(fila.size());

        fila.libera();


        System.out.println(fila.size());

        fila.inserir(1);
        fila.inserir(2);
        fila.inserir(3);
        fila.inserir(4);

        fila.retirar();

        System.out.println(fila.size());


    }
}