import java.util.Scanner;

public class Main {
    static Scanner scr= new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        scr.close();
    }

private static void task1() {
//    1. Написать программу для проверки на валидность введенного ip адреса.
//    Пусть ip адрес задается с консоли. Программа должна проверять валидность введенного ip адреса с
//    помощью регулярного выражения и выводить результат проверки на экран.

        System.out.println("Введите IP в формате 0.0.0.0");
        String input = scr.nextLine();
//        String input = "192.168.0.255";
            boolean result = input.matches("((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
            if (result) {
                System.out.println(input+" - соответсвует диапазону IP-адресов.");
            } else {
                System.out.println(input+"  - это не IP-адрес.");
            }
    }
}