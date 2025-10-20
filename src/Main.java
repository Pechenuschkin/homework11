import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Task # 1
    public static String checkingTheLeapYear(int year) {
        if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
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
    public static String calculateDeliveryTime(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance < 20) {
            day++;
        } else if (deliveryDistance < 60) {
            day += 2;
        } else if (deliveryDistance <= 100) {
            day += 3;
        } else {
            day = 0;
        }
        if (day == 0) {
            return " доставки нет ";
        } else {
            return "Потребуется дней:" + day;
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
        int clientDeviceYear = LocalDate.now().getYear();
        String clientOS1 = getOperationSystem(osName, clientDeviceYear);
        System.out.println(clientOS1);
        // Task # 3
        System.out.println();
        System.out.println(" Task # 3 ");
        int deliveryDistance = 70;
        String deliveryDay = calculateDeliveryTime(deliveryDistance);
        System.out.println(deliveryDay);
    }
}
