//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Task # 1
    public static int getYear() {
        return 2025;
    }

    // Task # 2
    public static int getOperationSystem(String osName) {
        if (osName.equals("iOS")) {
            return 0;
        } else if (osName.equals("Android")) {
            return 1;
        } else {
            return 2;
        }
    }

    public static int getTheDeviceYear(int clientDeviceYear) {
        if (clientDeviceYear < 2015) {
            return 0;
        } else {
            return 1;
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
        int year = getYear();
        if ((year >= 1584 && year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным ");
        } else if (year < 1584) {
            System.out.println(" Високосный год был введён в 1584 году ");
        } else {
            System.out.println(year + " год не является високосным ");
        }
        // Task # 2
        System.out.println();
        System.out.println(" Task # 2 ");
        String osName = "iOS";
        int clientOS = getOperationSystem(osName);
        int clientDeviceYear = 2017;
        int getTheDeviceYear = getTheDeviceYear(clientDeviceYear);
        String operationSystem;
        if (clientOS == 0) {
            operationSystem = "iOS";
        } else if (clientOS == 1) {
            operationSystem = "Android";
        } else {
            System.out.println(" Такой операционной системы нет ");
            return;
        }
        if (getTheDeviceYear < 2015) {
            System.out.println(" Установите облегченную версию приложения для " + operationSystem + " по ссылке ");
        } else {
            System.out.println(" Установите версию приложения для " + operationSystem + " по ссылке ");
        }
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
