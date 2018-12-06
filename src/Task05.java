public class Task05 {
    public static void main(String[] args) {
        int n = 356;
        int i = 2;

        System.out.printf("Число %d в двоичном виде: %s\n",n,Integer.toBinaryString(n));
        int tmp =n & (n ^ 1<<i);
        System.out.printf("Число %d с обнуленным %d-м битом (нумерация с нуля): %s\n",n,i,Integer.toBinaryString(tmp));
    }
}
