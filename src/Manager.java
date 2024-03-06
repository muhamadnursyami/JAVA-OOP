 class Manager extends Employee {

String company;

//    Membuat constructor di kelas
//     jika kita membuat sebuah constructor di class manager
//     maka class childnya atau class VicePresident harus
//     juga menggunakan constructor.
//     jika constructor di class parent atau class manager
//     itu tidak memiliki parameter maka di class child atau
//     di kelas VicePresident tidah harus membuat coonstructor
//     karena constructor yang tidak memiliki parameter
//     maka di sebut default constructor
//      Nama constructor harus sama dengan nama classnya
     Manager(String name) {
         //contoh materi sebelum polymophism
//         this.name = name;
         super(name);
     }

     Manager(String name, String company){
         super(name);
         this.company = company;
     }


    void sayHello(String name) {
        System.out.println("Hi" + name + "My name is Manager " + this.name);
    }
}
