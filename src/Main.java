//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Task # 1
    public static String checkingTheLeapYear(int year) {
        if ((year >= 1584 && year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return year + " год является високосным ";
        } else if (year < 1584) {
            return " Високосный год был введён в 1584 году ";
        } else {
            return year + " год не является високосным ";
        }
    }

    // Task # 2
    public static String getOperationSystem(String osName, int clientDeviceYear) {
        String operationSystem;
        if (osName.equals("iOS")) {
            operationSystem = "iOS";
        } else if (osName.equals("Android")) {
            operationSystem = "Android";
        } else {
            return " Такой операционной системы нет ";
        }
        if (clientDeviceYear < 2015) {
            return " Установите облегченную версию приложения для " + operationSystem + " по ссылке ";
        } else {
            return " Установите версию приложения для " + operationSystem + " по ссылке ";
        }
    }

    // Task # 3
    public static int getDeliveryDay(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            return day;
        } else if (deliveryDistance < 60) {
            return day += 1;
        } else if (deliveryDistance <= 100) {
            return day += 2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Task # 1
        System.out.println(" Task # 1 ");
        int year = 2025;
        String yearOfRelease = checkingTheLeapYear(year);
        System.out.println(yearOfRelease);
        // Task # 2
        System.out.println();
        System.out.println(" Task # 2 ");
        String osName = "iOS";
        int clientDeviceYear = 2017;
        String clientOS1 = getOperationSystem(osName, clientDeviceYear);
        System.out.println(clientOS1);
        // Task # 3
        System.out.println();
        System.out.println(" Task # 3 ");
        int deliveryDistance = 12;
        int deliveryDay = getDeliveryDay(deliveryDistance);
        if (deliveryDay == 0) {
            System.out.println(" досавки нет ");
        } else {
            System.out.println("Потребуется дней:" + deliveryDay);
        }
    }
}
