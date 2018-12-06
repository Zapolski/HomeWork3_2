public class Task07 {
    public static void main(String[] args) {
        int n = 356;
        int i = 5;

        System.out.printf("Число %d в двоичном виде: %s\n",n,Integer.toBinaryString(n));
        int tmp =(n >> i)&1;
        System.out.printf("%d-й бит числа (нумерация с нуля) установлен в: %d\n",i,tmp);
    }

}
