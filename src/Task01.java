public class Task01 {
    public static void main(String[] args) {
        int n=15;
        System.out.println("Исходное число: "+ Integer.toBinaryString(n));
        n=n & ~1;
        System.out.println("Число с обнулением в нулевом разряде: "+ Integer.toBinaryString(n));
    }
}
