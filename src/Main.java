public class Main {
    public static void printYear(int newYear) { // Метод для Задачи1
        if (newYear % 4 == 0 && newYear % 100 != 0) {
            System.out.println(newYear + " год -  високосный год");
        } else if (newYear % 400 == 0) {
            System.out.println(newYear + " год -  високосный год");
        } else {
            System.out.println(newYear + " год - невисокосный год");
        }
    }

    public static void main(String[] args) { // Задача 1
        int year = 2400;
        printYear(year);


        int clientOS = 1;// Задача 2
        int clientDeviceYear = 2023;
        versionIos (clientOS, clientDeviceYear);

        int deliveryDistance = 110;// Задача 3
        String deliveryDays = deliveryDays(deliveryDistance);
        System.out.println(deliveryDays);
    } //end method main

    public static String deliveryDays(int newDeliveryDistance) { // Метод для задачи 3
        if (newDeliveryDistance <= 20) {
            return "Доставка в пределах суток ";
        } else if (newDeliveryDistance > 20 && newDeliveryDistance <= 60) {
            return "Доставка двое суток";
        } else if (newDeliveryDistance > 60 && newDeliveryDistance <= 100) {
            return "Доставка трое суток";
        } else {
            return ("Доставки нет");
        }
    }

    public static void versionIos(int newclientOS, int newclientDeviceYear) { // Метод для Задачи2
        if (newclientOS == 0 && newclientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (newclientOS == 1 && newclientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (newclientOS == 0 && newclientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}





