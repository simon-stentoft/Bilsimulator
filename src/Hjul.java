import java.util.Scanner;

public class Hjul {

    public static void drejHjul() {
        System.out.print("Hvilken vej?: ");
        Scanner input = new Scanner(System.in);
        String drejRetning = input.nextLine();

        System.out.println("Hvor meget?: ");
        int drejHjulGrader = input.nextInt();

        if (drejRetning == "højre") {
            System.out.println("Drejer mod " + drejRetning + " " + drejHjulGrader + "%.");
        }
        else {
            System.out.println("Drejer mod " + drejRetning + " -" + drejHjulGrader + "%.");
        }
    }
}
