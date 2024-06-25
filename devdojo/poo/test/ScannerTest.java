package devdojo.poo.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você da o rabo?");
        String name = scanner.nextLine();

        if (name.charAt(0) == ' ') {
            System.out.println("Da o rabinho sim....");
            return;
        }

        System.out.println("Okay tu n da");

    }
}
