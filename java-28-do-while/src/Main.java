public class Main {

    public static void main(String[] args) {

        /*
             do {
               aksi
            } while (kondisi);

         */

        System.out.println("awal program");

        int a = 8;
        boolean kondisi = true;

        do {
            a++;
            System.out.println("do while ke - " + a);
            if (a == 10){
                kondisi =false;
            }
        } while (kondisi);

        System.out.println("akhir program");
    }
}