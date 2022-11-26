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
        //Задание №4 5
        int total = 15000;
        int percent = 7;
        int mounth0 = 0;


        for (; total < 12000000;) {
            total = total + total * percent / 100;
            mounth0++;
            if (mounth0 % 6 == 0) {
                System.out.println("mounth " + mounth0 + " savings " + total);
            }
            if (total >= 12000000) {
                    System.out.println("finish mounth " + mounth0 + " savings " + total);
            }

        }

        //Задание №6
        int total1 = 15000;
        int percent1 = 7;
        int mounth1 = 0;


        for (; total1 < 12000000;) {
            total1 = total1 + total1 * percent1 / 100;
            mounth1++;
            if (mounth1 % 6 == 0&& mounth1 <= 104) {
                System.out.println("mounth " + mounth1 + " savings " + total1);
            }

        }
        //Задание 7
        int friday = 2;
        while (friday < 31) {
            if ((friday - 2) % 7 == 0) {
                System.out.println("Сегодня пятница," + friday + "-е число. Необходимо подготовить отчет.");
            }
            friday++;
        }
        //Задание 8
        int start = 0;
        int finish = 2122;
        while (start < finish) {
            start += 79;
            if (start > 1822 && start < 2122) {
                System.out.println(start);
            }
        }
        //Задание 9
        for (i = 1; i <= 10; i++) {
            int j = i * 2;
            System.out.println("2*" + i + "=" + j);
        }
    }
}
