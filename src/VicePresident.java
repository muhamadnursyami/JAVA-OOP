import javax.xml.namespace.QName;

class VicePresident extends Manager {

//    Karena di class parent/ di class Manager
//     menggunakan constructor yang memiliki paramater
//     maka kita perlu membuat constructor juga dengan
//     menggunakan keyword super.
//     Nama constructor harus sama dengan nama classnya
     VicePresident (String name) {
         super(name);
     }




//    Use Method Overriding
//    Karena membuat sebuah method yang sama dengan
//    Method yang ada di class parent namun memiliki sedikit
//    perbedaan di My name is nya
//    tapi tetap harus sama apa yang di kirim
//     dan method sayHello yang ada di Manager itu tidak bisa
//     digunakan lagi karena udah di timpa dengan method
//     yang telah di buat sendiri seperti di bawah ini.
     void sayHello(String name) {
         System.out.println("Hi" + name + "My name is VP " + this.name);
     }
}
