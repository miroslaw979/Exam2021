import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int num = number / 100 % 10; //3
        int secont = number / 10 % 10; //2
        int third = number % 10; //4

        for (int i = 1; i <=third; i++) {
            for (int j = 1; j <=secont; j++) {
                for (int k = 1; k <=num ; k++) {
                    int sum = i * j * k;
                        System.out.printf("%d * %d * %d = %d;%n",i,j,k,sum);
                    }
                }
            }
        }
    }

