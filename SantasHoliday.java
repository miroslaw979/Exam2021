import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String ocenka = scanner.nextLine();

        double priceOnePerson = 18;
        double apartament = 25;
        double president = 35;
        double price = 0;
        daysCount = daysCount -1;
        if (typeRoom.equals("room for one person")){
            if (daysCount<=10){
                price = 18 * daysCount;
            } else if (daysCount > 10 && daysCount <=15) {
                price = 18 * daysCount;
            } else if (daysCount >15) {
                price = 18 * daysCount;
            }
        } else if (typeRoom.equals("apartment" )) {
            price = daysCount * 25;
            if (daysCount<=10){
                price = price * 0.70;
            } else if (daysCount > 10 && daysCount <=15) {
                price = price * 0.65;
            } else if (daysCount > 15) {
                price = price * 0.50;
            }
        } else if (typeRoom.equals("president apartment" )) {
            price = daysCount * 35;
            if (daysCount<=10){
                price = price * 0.90 ;
            } else if (daysCount > 10 && daysCount <=15) {
                price = price * 0.95;
            } else if (daysCount >15) {
                price = price * 0.80;
            }
        }

        if (ocenka.equals("positive")){

        }
    }
}
