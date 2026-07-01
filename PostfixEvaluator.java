import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Postfix ifadeyi giriniz:");
        String expression = scanner.nextLine();

        try {

            int result = PostfixEvaluator.evaluatePostfix(expression);

            System.out.println("Sonuç: " + result);

        } catch (Exception e) {

            System.out.println("Hata: " + e.getMessage());
        }

        scanner.close();
    }
}
