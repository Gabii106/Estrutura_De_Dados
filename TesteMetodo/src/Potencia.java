public class Potencia {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int resultado = Pot(a, b);
        System.out.println(resultado);
    }

    public static int Pot(int x, int n){
        if( n == 0){
            return 1;
        } else {
            return (x * Pot(x, (n-1)));
        }
    }
}
