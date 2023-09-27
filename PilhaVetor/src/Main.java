public class Main {
    public static void main(String[] args) {
       PilhaVetor pilha = new PilhaVetor();

        System.out.println(pilha.vazia());

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);
        pilha.push(6);

        System.out.println(pilha.vazia());

        System.out.println(pilha.size());

        pilha.pop();

        System.out.println(pilha.size());

        pilha.libera();

        System.out.println(pilha.size());


    }
}