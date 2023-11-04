import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Qoshish qoshish = new Qoshish();
        Sotish sotish = new Sotish();
        Ochirish ochirish = new Ochirish();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Oldi sotti dasturiga xush kelibsiz!!!");
        System.out.println("1--Bazaga product qoshish");
        System.out.println("2--Sotishni boshlash");
        System.out.println("3--Product o'chirish");
        System.out.println("4--Product tahrirlash");
        int command = scanner.nextInt();
        switch (command) {
            case 1: {
                qoshish.qosishniBoshlash();
            }
            case 2: {
                sotish.sotishniBoshlash();
            }

            case 3: {
                ochirish.ochirishniBoshlash();
            }

            case 4: {

            }


        }
    }
}