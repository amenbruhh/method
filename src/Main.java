import java.time.LocalDate;

public class Main {

    // задача 1
    public static void checkYear(int year) {
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            System.out.println(year + " год - является високосным.");
        } else {
            System.out.println(year + " год - не является високосным.");
        }
    }

    // задача 2
    public static void printAppVersion(int currentYear,int clientOS) {

        if (currentYear <= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android");
            }
        }
    }

    // задача 3
    public static void calculateDeliveryDays(int deliveryDistance) {

        int deliveryDays;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("К сожалению, доставка недоступна");
            return;
        }
        System.out.println("Потребуется дней: " + deliveryDays);

    }

    public static void main(String[] args) {

        int year = 1900;
        checkYear(year);
        System.out.println();

        int clientOS = 0;
        int currentYear = 2024;
        printAppVersion(currentYear, clientOS);
        System.out.println();

        int deliveryDistance = 1000;
        calculateDeliveryDays(deliveryDistance);
    }
}