public class TesteMetodo2 {
    public static void main(String[] kkkkkkkk) {
        int x = 4;
        int y = 3;
        int resultado = somaDeInteiros(x, y);

        System.out.println("Resultado da soma: "+resultado);
        System.out.println("Dobro da soma: "+somaDeInteiros(resultado, resultado));
    }

    public static int somaDeInteiros(int a, int b){
       // int resultado = a + b;
        return (a + b);
    }
}
