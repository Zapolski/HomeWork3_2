public class Task12 {
    public static void main(String[] args) {

        int n = 15;

        //количество разрядов числа в двоичной систем через логарифмы
        int digit = (int)(Math.log10(n)/Math.log10(2))+1;
        int mask = (1<<digit)-1;//строим маску так, что все разряды были единицы
        n = n^mask;//применяем:  число XOR маска

        System.out.printf("Побитовое представление числа %d: %s\n",n,Integer.toBinaryString(n));
        if (n>0){
            System.out.println("В числе присутствуют нулевые биты.");
        }else{
            System.out.println("В числе отсутствуют нулевые биты.");
        }
    }
}
