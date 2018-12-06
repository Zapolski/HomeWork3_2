public class Task03 {

    public static void main(String[] args) {
        int n = 356;
        int i = 4;

        System.out.printf("Число %d в двоичном виде: %s\n",n,Integer.toBinaryString(n));
        int tmp = n | 1<<i;
        System.out.printf("Число %d с установленным %d-м битом (нумерация с нуля): %s\n",n,i,Integer.toBinaryString(tmp));
    }



}
