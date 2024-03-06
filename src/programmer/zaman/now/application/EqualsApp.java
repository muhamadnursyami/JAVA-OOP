package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Eko";
        first  = first + " " + "Syami";

        System.out.println(first);
        String second = "Eko Syami";
        System.out.println(second);
//      di java kita tidak bisa membandingkan objek dengan objek menggunakan ==
//        String itu adalah objek di java
//      Karena jika kita pakai == dia akan mengecek lokasi memorinya apakah sama atau beda
//      bukan karakter String nya
        System.out.println(first == second);
//        Nah jika kita ingin membandingkan isi karakternya kita bisa menggunakan
//        method equals

        System.out.println(first.equals(second));
//        tapi jika suatu variabel itu charakternya sama seperti ini
//        maka akan true karena coba kita lihat variabel first itu awalnya eko kemudian di ubah
//        menjadi Eko Syami
//        Sedangkan variabel second dan third itu sudah di assign pertama kali dengan data
//        Eko Syami maka hasilny true.  karena di java kalo karakternya sama maka tidak dibuat
//        penyimpanan memori baru.
        String third = "Eko Syami";
        System.out.println(second == third);



    }

}
