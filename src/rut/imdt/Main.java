package rut.imdt;
import java.util.Scanner;
public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static String enc(String message, String key) {
        String output = "";
        for (int i = 0; i < message.length(); i++) {
            output += String.valueOf((char)(message.charAt(i) ^ key.charAt(i % key.length())));
        }
        return output;
    }
    public static void main(String[] args) {
        System.out.print("Введите ключ: ");
        String key = sc.nextLine();
        System.out.print("Введите сообщение: ");
        String input = sc.nextLine();
        System.out.printf("Зашифрованное сообщение: %s", enc(input, key));
        System.out.printf("\nДешифрованное сообщение: %s", enc(enc(input, key), key));
    }
}