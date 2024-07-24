import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número inteiro: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            Integer numWrapper = num;
            System.out.println("O valor digitado foi: " + numWrapper);
        }
    }
}
