public class PersonApp {
    public static void main(String[] args) {
//        Ini menginisialisasi objekc pada class person dengan menggunakan constuctur
//        Dan wajib mengirimkan semua parameter
        var person1 = new Person("Jokowi", "Palembang" );
//        Menginisialisasi objeck pada class person tanpa  menggunakan costructur
//        var person1 = new Person();
//         Mengubah data pada objek tanpa menggunakan constructor
//        person1.name ="Syami";
//        person1.address= "Jakarta";
//      person1.country -> tidak bisa di ubah karena menggunakan finaly

//        Mengakses method
        person1.sayHello("Budi");

    }
}
