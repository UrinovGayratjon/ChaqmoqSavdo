import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sotish {
    List<Product> bazadagiProductlar = new ArrayList<>();

    List<Product> savatcha = new ArrayList<>();

    public Sotish() {
        try {
            FileInputStream fileInputStream = new FileInputStream("Productlar.txt");
            Scanner fileScanner = new Scanner(fileInputStream);

            while (fileScanner.hasNext()) {
                String text = fileScanner.nextLine();
                //text = Nohot,4784567,23000
                String[] malumotlar = text.split(",");
                String productName = malumotlar[0];
                int shtrixKodi = Integer.parseInt(malumotlar[1]);
                int narx = Integer.parseInt(malumotlar[2]);
                Product p1 = new Product(productName, narx, shtrixKodi);
                bazadagiProductlar.add(p1);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void sotishniBoshlash() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Product shtrix kodini kiriting");

        while (true) {
            int shtrixKodi = scanner.nextInt();
            if (shtrixKodi == -1) {
                break;
            }
            for (int i = 0; i < bazadagiProductlar.size(); i++) {
                if (bazadagiProductlar.get(i).getShtrix() == shtrixKodi) {
                    savatcha.add(bazadagiProductlar.get(i));
                }
            }
        }

        int sum = 0;
        System.out.println("Check");
        for (int i = 0; i < savatcha.size(); i++) {
            Product p2 = savatcha.get(i);
            System.out.println(p2.getName() + " ---" + p2.getNarx());
            sum = sum + savatcha.get(i).getNarx();
        }

        System.out.println("Jami Narx=" + sum);
    }

}
