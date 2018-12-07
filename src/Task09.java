public class Task09 {
    public static void main(String[] args) {
        int m=7;
        int n=5;

        int tmp = m ^ n;

        if (tmp >0){
            System.out.printf("Числа %d и %d имеют одинаковые знаки.",n,m);
        }else{
            System.out.printf("Числа %d и %d имеют разные знаки.",n,m);
        }
    }
}
