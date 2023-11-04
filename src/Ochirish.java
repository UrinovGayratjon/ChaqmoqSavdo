import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Ochirish {


    List<Product> bazadagiProductlar = new ArrayList<>();


    public Ochirish() {
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

    public void ochirishniBoshlash() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ShtrixKodni kiriting=");
        int shtrix = scanner.nextInt();

//        bazadagiProductlar.removeIf(product -> product.getShtrix() == shtrix);

        for (int i = 0; i <bazadagiProductlar.size() ; i++) {
            Product p = bazadagiProductlar.get(i);
            if (p.getShtrix() == shtrix){
                System.out.print( p.getName()+" yangi narxini kiriting=");
                int narx = scanner.nextInt();
                p.setNarx(narx);
            }
        }
        updateFile();
    }

    private void updateFile() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Productlar.txt");
            for (Product p : bazadagiProductlar) {
                String text = p.getName() + "," + p.getShtrix() + "," + p.getNarx() + "\n";
                fileOutputStream.write(text.getBytes());
            }
            fileOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
