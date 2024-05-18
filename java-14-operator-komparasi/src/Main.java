public class Main {

    public static void main(String[] args) {

        // operator komparasi, ini akan meghasilkan nilai boolean

        int a, b;
        boolean hasilKomparasi;

        // operator equal atau persamaan
        System.out.println("========== PERSAMAAN ==========");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi); // %s itu nilai string (true atau false)

        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);

        // operator not equal atau pertidaksamaan itu pakai (!)
        System.out.println("========== PERTIDAKSAMAAN ==========");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi); // %s itu nilai string (true atau false)

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);

        // operator less than atau kurang dari
        System.out.println("========== KURANG DARI ==========");
        a = 10;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi); // %s itu nilai string (true atau false)

        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);

        // operator greater than atau lebih dari
        System.out.println("========== LEBIH DARI ==========");
        a = 10;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi); // %s itu nilai string (true atau false)

        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);

        // operator less than equal atau kurang dari sama dengan
        System.out.println("========== KURANG DARI SAMA DENGAN ==========");
        a = 9;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi); // %s itu nilai string (true atau false)

        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);

        // operator greater than equal atau lebih dari SAMA DENGAN
        System.out.println("========== LEBIH DARI SAMA DENGAN ==========");
        a = 9;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi); // %s itu nilai string (true atau false)

        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);





    }
}