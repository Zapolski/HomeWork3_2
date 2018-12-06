public class Task06 {
    public static void main(String[] args) {
        int n = 356;
        int i = 3;

        System.out.printf("Число %d в двоичном виде: %s\n",n,Integer.toBinaryString(n));
        int mask = (1 << i)-1;
        int tmp =n & mask;
        System.out.printf("Число %d с обнуленным битами кроме %d-х последних: %s\n",n,i,Integer.toBinaryString(tmp));
    }
}
