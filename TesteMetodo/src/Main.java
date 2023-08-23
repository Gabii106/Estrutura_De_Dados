public class Main {
    public static void main(String[] args) {
        mostrarMensagem(2);
        mostrarMensagem(1);
        mostrarMensagem(7);

    }

    public static void mostrarMensagem(int n){
        for (int i=0; i<n; i++){
            System.out.println("Passei por aqui...");
        }
    }

}