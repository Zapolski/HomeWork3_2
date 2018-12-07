public class Task10 {
    public static void main(String[] args) {

        int m = 56;
        int n = 11;

        int min = m & ((m-n) >> 31) | n & (~(m-n) >> 31);

        System.out.printf("Минимальное из числе %d и %d: %d",m,n,min);
    }
}
