public class Main {
    public static void main(String[] args) {

        // konervsi tipe data numeric

        int nilaiInteger = 450; //32 bit
        System.out.println("nilai int = " + nilaiInteger);

        // memperluas rentang ke tipe data yang lebih besar
        long nilaiLong = nilaiInteger;
        System.out.println("nilai long = " + nilaiLong);

        // memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInteger;
        System.out.println("nilai byte = " + nilaiByte);
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);

        // casting pembagian
        int a = 10;
        float b = 4;

        float c = 10 / 4;
        System.out.printf("%d / %f = %f\n", a, b, c);

        int x = 10;
        int y = 4 ;

        float z = (float) 10 / 4; // nilai integer di casting menjadi nilai float
        System.out.printf("%d / %d = %f\n", x, y, z);


    }
}