import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dollarsProcesro = Double.parseDouble(scanner.nextLine());
        double dollarsVideo = Double.parseDouble(scanner.nextLine());
        double dollarsRam = Double.parseDouble(scanner.nextLine());
        int countRam = Integer.parseInt(scanner.nextLine());
        double percentDisocunt = Double.parseDouble(scanner.nextLine());

        double priceProcessor = dollarsProcesro * 1.57;
        double priceVideo = dollarsVideo * 1.57;
        double priceRam = dollarsRam * 1.57;
        double sumRam = priceRam * countRam;


        double procesorDiscount = priceProcessor - (priceProcessor * percentDisocunt);
        double videoDiscount = priceVideo - (priceVideo * percentDisocunt);
        double sum = procesorDiscount + videoDiscount + sumRam;
        System.out.printf("Money needed - %.2f leva.",sum);
    }
}