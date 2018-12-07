public class Task11 {
    public static void main(String[] args) {
        int n = 178;

        int count = 0;
        for (int i=0; i<32; i++)//для типа int
        {
            if (Math.abs((n >> i) % 2) == 1)
                count++;
        }
        System.out.printf("Побитовое представление числа %d: %s\n",n,Integer.toBinaryString(n));
        System.out.println("Количество единичных битов: "+count);
    }


}
