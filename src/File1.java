import java.util.Scanner;

public class File1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Введите числа:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = a - b;
    }
}
