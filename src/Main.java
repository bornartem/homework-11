public class Main {
    public static void printYear(int newYear) { // Метод 1 для Задачи1
        System.out.println(newYear + " год -  високосный год");
    }
    public static void printYear1(int newYear) { // Метод 2 для Задачи1
        System.out.println(newYear + " год - невисокосный год");
    }

    public static void main(String[] args) { // Задача 1
        int year = 2009;
        if (year % 4 == 0 && year % 100 != 0) {
            printYear(year);
        } else if (year % 400 == 0) {
            printYear(year);
        } else {
            printYear1(year);
        }

        int clientOS1 = 0;// Задача 2
        int clientDeviceYear = 2023;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            oldIos(clientOS1, clientDeviceYear);
        } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
            oldAndroid(clientOS1, clientDeviceYear);
        } else if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            newIos(clientOS1, clientDeviceYear);
        } else {
            newAndoid();
        }

            int deliveryDistance = 110;// Задача 3
            String deliveryDays = deliveryDays (deliveryDistance);
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

    public static void oldIos(int newclientOS, int newclientDeviceYear) { // Метод 1 для Задачи2
        System.out.println("Установите облегченную версию приложения для IOS по ссылке");
    }
    public static void oldAndroid(int newclienOS, int newclientDeviceYear) { // Метод 2 для Задачи2
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
    public static void newIos(int newclienOS, int newclientDeviceYear) { // Метод 3 для Задачи2
        System.out.println("Установите версию приложения для IOS по ссылке");
    }
    public static void newAndoid() { // Метод 4 для Задачи2
        System.out.println("Установите версию приложения для Android по ссылке");
    }



}





