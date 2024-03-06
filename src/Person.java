public class Person {
    String  name;
    String  address;
//    Tipe data final tidak bisa di ubah lagi
    final String country = "Indonesia";

//    Menambahkan constructor
//    penamaan constructor itu harus sama dengan classnya
    Person(String paramName, String paramAd) {
//        Kemudian kita tambahkan nilai dari paramName kedalam String name
        name = paramName;
        address = paramAd;
    }

//    Kita bisa menggunakan constructor overloading namun
//    harus memiliki tipe data atau parameter yang berbeda  contoh dibawah ini
//   Person(String paramName)
//      }
//      Person()
//      }

//    Dan ada juga memanggil constructor lain dengan
//    menggunakan this, materi nya ada di java oop overloading pzn
    void sayHello (String paramName){
        System.out.println("Hello " + paramName + "My name is " + name);
    }
}
