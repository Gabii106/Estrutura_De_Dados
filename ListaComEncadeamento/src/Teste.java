import java.util.Arrays;

public class Teste {

    public static void main(String[] args) {
        //ListaComEncadeamento lista = new ListaComEncadeamento(); = size = 0
        //ListaComEncadeamento lista; = NullPointerExeption
        ListaComEncadeamento lista = new ListaComEncadeamento();


        System.out.println(lista.isEmpty());

        lista.add(0);
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        System.out.println(lista.isEmpty());
        System.out.println("Tamanho 1: "+lista.size());
        for(int i =0; i < lista.size(); i++){
            String prim = lista.get(i).toString()+ " ";
            System.out.print(prim);
        }
        //lista.remove(3);
        System.out.println("\nRemoveu: "+lista.remove(2));
        System.out.println("String: "+lista.toString());
        System.out.println("Removeu: "+lista.remove(3));
        System.out.println("String: "+lista.toString());
        System.out.println("Removeu: "+lista.remove(0));


        for(int i =0; i < lista.size(); i++){
            String prim = lista.get(i).toString()+ " ";
            System.out.print(prim);
        }
        //System.out.println(lista.remove(-1));

        System.out.println("\nTamanho 2: "+lista.size());

        System.out.println("Get 0: "+lista.get(0));
        System.out.println("Get 1: "+lista.get(1));
        System.out.println("Get 2: "+lista.get(2));
        System.out.println("Get 3: "+lista.get(3));
        System.out.println("Get 4: "+lista.get(4));
        System.out.println("Get -1: "+lista.get(-1));

        lista.set(0, 8);
        lista.set(2, 8);

        System.out.println("Get: "+lista.get(0));


        System.out.println("Contains 8: "+lista.contains(8));
        System.out.println("Contains 10: "+lista.contains(10));

        System.out.println("IndexOf 4: "+lista.indexOf(4));
        System.out.println("IndexOf 10: "+lista.indexOf(10));

        System.out.println("IndexOf 8: "+lista.indexOf(8));
        System.out.println("LastIndexOf 8: "+lista.lastIndexOf(8));


        //for (NoLista a : lista){

       // }/
       //for(int i =0; i < lista.size(); i++){
       //     String prim = lista.get(i).toString()+ " ";
       //     System.out.print(prim);
       // }

        System.out.println("\nString: "+lista.toString());
        //System.out.println("Array: "+ Arrays.toString(lista.toArray())); //Só assim funciona

        lista.add(8);
        lista.add(8);

        System.out.println(lista.removeFirst(8));

        //System.out.println("String: "+lista);

        //System.out.println(""+lista);
        System.out.println("\nTamanho 3: "+lista.size());

        for(int i =0; i < lista.size(); i++){
            String prim = lista.get(i).toString()+ " ";
            System.out.print(prim);
        }


        lista.clear();
        System.out.println("\nTamanho 3: "+lista.size());
    }
}
