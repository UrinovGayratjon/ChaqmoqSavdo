import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Qoshish {

    public void qosishniBoshlash() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Maxsulotni nomini kiriting=");
        String name = scanner.nextLine();
        System.out.print("Maxsulotni narxini kiriting=");
        int narx = scanner.nextInt();
        System.out.print("Maxsulotni shtrix kiriting=");
        int shtrixKodi = scanner.nextInt();
        try {

            FileOutputStream fileOutputStream = new FileOutputStream("Productlar.txt", true);
            String text = name + "," + shtrixKodi + "," + narx + "\n";
            fileOutputStream.write(text.getBytes());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    public void productniOchirish() {

    }


}
