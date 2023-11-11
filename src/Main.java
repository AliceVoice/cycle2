public class Main {
    public static void main(String[] args) {
        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
        zad7();
        zad8();
    }

    public static void zad1() {
        int total = 0;
        int deposit = 15_000;
        int month = 0;

        while (total < 2_459_000) {
            total = total + deposit;
            month++;
            System.out.println("Месяц " + month + ", сумма накорплений равна " + total + " рублей");
        }
    }

    public static void zad2() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void zad3() {

        int population = 12_000_000;
        double birthRate = 17.0 / 1000;
        double deathRate = 8.0 / 1000;

        for (int year = 1; year <= 10; year++) {
            int births = (int) (population * birthRate);
            int deaths = (int) (population * deathRate);
            population += births - deaths;

            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void zad4() {
        int salary = 15_000;
        double total = 0;
        double tax = 0.07;
        int months = 1;

        for (; total < 12_000_000; months++) {
            total = (int) (total + salary);
            total = (int) (total + total * tax);
            System.out.println("Месяц " + months + ", накопления: " + total);
        }
    }

    public static void zad5() {
        int salary = 15_000;
        double total = 0;
        double tax = 0.07;
        int months = 1;

        for (; total < 12_000_000; months++) {
            total = (int) (total + salary);
            total = (int) (total + total * tax);
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", накопления: " + total);
            }
        }
    }

    public static void zad6() {
        int salary = 15_000;
        double total = 0;
        double tax = 0.07;
        int months = 1;
        int yearSpent = 9;
        int monthsSpent = yearSpent * 12;

        for (; months <= monthsSpent; months++) {
            total = (int) (total + salary);
            total = (int) (total + total * tax);
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", накопления: " + total);
            }
        }
    }

    public static void zad7() {
        int firstFriday = 3;

        for (int day = 1; day <= 31; day++) {

            if (day % 7 == firstFriday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }
    }

    public static void zad8() {
        int currentYear = 2023;
        int pastYear = currentYear - 200;
        int futureYear = currentYear + 100;
        int comet = 79;

        for (int year = pastYear; year < futureYear; year++) {
            if ((year - pastYear) % comet == 0) {
                System.out.println(year);
            }
        }
    }
}
