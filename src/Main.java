import java.time.LocalDate;

public class Main {
    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void checkOS (int clientDeviceYear, int clientOS) {
    if (clientOS == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (clientOS == 0 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOS == 1 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    } else if (clientOS == 1 && clientDeviceYear >= 2015) {
        System.out.println("Установите версию приложения для Android по ссылке");
    } else {
        System.out.println("Используйте браузерную версию");
    }
}
    public static void checkDistance (int deliveryDistance) {
        int amountOfDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + amountOfDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (amountOfDays + 1));
        } else if (deliveryDistance >=60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (amountOfDays + 2));
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1 () {
// Задача 1
        int year = 2021;
        checkYear(year);
    }
        public static void task2 () {
// Задача 2
        int clientDeviceYear = 2015;
        int clientOS = 0;
            checkOS(clientDeviceYear, clientOS);
        }
        public static void task3 () {
// Задача 3
        int deliveryDistance = 80;
            checkDistance(deliveryDistance);
        }
    }
