public class Task08 {
    public static void main(String[] args) {
        int n = 356;

        System.out.printf("Число %d в двоичном виде: %s\n",n,Integer.toBinaryString(n));

        //ищем номер старщего бита
        int count =1;
        int tmp = 1;
        while (tmp <= n){
            tmp <<= 1;
            count++;
        }
        //System.out.println(--count);

        tmp =n & (n ^ 1<<(count-2));
        System.out.printf("Число %d с обнуленным старшим битом: %s\n",n,Integer.toBinaryString(tmp));
    }
}
