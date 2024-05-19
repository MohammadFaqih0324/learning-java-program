import java.util.Scanner;

public class Main {
    public static  void main(String[] args){

        // kesimpulannya adalah :
        // perklaian atau pembagian akan di lakukan terlebih dahulu

        // jika di lakukan perkalian dan pembagian, maka akan di lakukan operasinya dari kiri ke kanan

        int hasil = 5 * 10 / 2;
        System.out.println("hasil dari (5 * 10) / 2 = " + hasil);
        hasil = 5 + 2 - 10;
        System.out.println("hasil dari (5 + 2) - 10 = " + hasil);

        // menggunakan pengelompokkan operasi dengan (isi dari pengelompokkan)
        hasil = 60 / (2 + 10);
        System.out.println("hasil dari 60 / (2 + 10) = " + hasil);

        Scanner userInput = new Scanner(System.in);
        // menghitung persamaan kuadrat
        System.out.println("\n===== MENGHITUNG PERSAMAAN KUADRAT =====");
        int x,m,c;

        System.out.print("nilai x = ");
        x = userInput.nextInt();
        System.out.print("gradient m = ");
        m = userInput.nextInt();
        System.out.print("nilai c = ");
        c = userInput.nextInt();

        int y = (m * x * x) + c; // --> rumus
        System.out.print("nilai y = " + y);

    }
}