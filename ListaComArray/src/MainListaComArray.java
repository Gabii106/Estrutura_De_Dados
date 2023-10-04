public class MainListaComArray {
    public static void main(String[] args)  {
        ListaComArray lista = new ListaComArray();
        lista.add(2);
        lista.add(77);
        lista.add(0);
        lista.add(-81);
        Integer valorRemovido = lista.remove(1);
        System.out.println("Removemos o valor: " + valorRemovido);
        if ( !lista.isEmpty() ) {
            System.out.println("Lista não está vazia!");
            System.out.println("Tamanho atual da lista: " + lista.size());
            for (int i=0; i < lista.size(); i++) {
                System.out.println("Elemento na posição "+i+": "+lista.get(i));
            }
        } else {
            System.out.println("Lista está vazia!");
        }
        System.out.println(lista);
    }
}
