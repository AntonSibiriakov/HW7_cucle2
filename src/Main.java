public class Main {
    public static void main(String[] args) {

        //Задание №1
        int savings = 0;
        int month = 0;
        while (savings < 2459000) {
            int i = 15000;
           savings += i;
           month++;
           if (savings >= 2459000 ) {
               System.out.println("Месяц " + month + " сумма накоплений " + savings);
           }
        }

        //Задание №2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задание №3
        int y = 12000000;
        int fertility = 17; //17-1000
        int mortality = 8;
        for (int j = 0; j < 10; j++) {
            y += y * fertility / 1000;
            y -= y * mortality / 1000;
            if (j == 9) {
                j++;
                System.out.println("Год " + j + " численность населения составляет " + y);
            }

        }

    }

}