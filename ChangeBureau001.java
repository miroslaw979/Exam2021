import java.util.Scanner;

public class ChangeBureau001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoinCount = Integer.parseInt(scanner.nextLine());
        double chineMoney = Double.parseDouble(scanner.nextLine());
        double comission = Double.parseDouble(scanner.nextLine());

        double allEuro = (bitcoinCount * 1168 + chineMoney * 0.15 * 1.76) / 1.95;
        double komisiona = allEuro * (comission * 0.01);
        double totalSum = allEuro - komisiona;
        System.out.printf("%.2f",totalSum);

    }
}
