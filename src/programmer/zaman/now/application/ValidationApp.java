package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {


        LoginRequest loginRequest = new LoginRequest(null, null);
//        LoginRequest loginRequest = new LoginRequest("sami, "rahasia);

//        Dalam menggunakan Class ValidationUtil, itu tidak bisa
//        langsung memanggil kelasnya, tetapi kita perlu menggunakan try catch
//        karena validation expection itu bisa menyebabkan error pada aplikasi
//        contoh kegunaan :
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");

        }
//        Cara bacanya adalah, kita ingin memberikan parameter berupa ValidationException itu
//        kemudian akan di simpan data nya kedalam variabel error
//        kita juga bisa menggabungkan catch nya
        catch (ValidationException | NullPointerException error){
            System.out.println("Terjadi error dengan pesan" + error.getMessage());
        }finally {
            System.out.println("Selalu di eksekusi");
        }


        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);
        System.out.println("Sukses");

    }
}
