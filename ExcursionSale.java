import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // more  =680lv, planina = 499lv
        int countSea = Integer.parseInt(scanner.nextLine());
        int countMountain = Integer.parseInt(scanner.nextLine());
        String nameVacantion = scanner.nextLine();

        int seaCount = 0;
        int mountainCount = 0;
        double profit = 0;

        while (!nameVacantion.equals("Stop")){
            switch (nameVacantion) {
                case "sea":
                    if (seaCount < countSea) {
                        seaCount++;
                        profit += 680;
                    }
                    break;
                case "mountain":
                    if (mountainCount < countMountain) {
                        mountainCount++;
                        profit +=499;
                    }
                    break;
            }
            if (seaCount + mountainCount == countSea + countMountain) {
                break;
            }
            nameVacantion = scanner.nextLine();
        }
        int totalExcursion = countSea + countMountain;
        int salesExcursion = seaCount + mountainCount;

        if (salesExcursion >= totalExcursion){
            System.out.println("Good job! Everything is sold.");
        }
        System.out.printf("Profit: %.0f leva.", profit);

    }
}

