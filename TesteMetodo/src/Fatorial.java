public class Fatorial {
    public static void main(String[] args) {
        int num = 5;
        int fat;
        fat = fatorial(num);
        System.out.println(fat);
    }

    public static int fatorial(int n){
        if(n == 1){
            return 1;
        } else{
            return n * fatorial(n-1);
        }
    }
}
