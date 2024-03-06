public class PolymorphismApp {
    public static void main(String[] args) {

//        Ini adalah Kode Polymorphism
//        yang merupakan
        Employee employee = new Employee("Eko");

        employee.sayHello("Budi");

        employee = new Manager("Eko");
        employee.sayHello("Budi");

        employee = new VicePresident("Eko");
        employee.sayHello("Budi");

//      Cara mengset ploymorshim kedalam method
//        ketika kita telah memberikan paremeter di method sayHello dibawah itu
//        adalah parameter yang Employee yang merupakan parent class
//        maka kita bisa menggunakan class child seperti manager dan vice president dari class parent.
        sayHello(new Employee("Eko"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Budi"));

    }

//    Method Polymorphism
//    Syaratnya menggunakan static keyword
//    dan memngirimkam sebuah parameter tipe nya yaitu Employee yang merupakan class parent
//    dan objecknya employee
    static  void sayHello (Employee employee){
//        Melakukan pengecekan dan konversi
//        instance of itu true atau false
//
        if (employee instanceof VicePresident){
//            Cara baca kode dibelow
//            jika kondisi true, ototmatis objeck employeenya itu bertipe Vice president
//            makanya di taruh paling depan  kemudian kita ingin membuat sebuah variabel bernama vicePresident
//            lihat kecil besar hurufnya untuk membedakan.
//            kemudian kita konversi, cara konversinya itu menggunakan tanda kurung () dan masukan
//            nilai dari VicePresident yang ddalam dari objeck employee
            VicePresident vicePresident = (VicePresident) employee;
//            maka otomatis mencetak dan bisa mengakases dengan nama variavel vicePresident
//            yan udah di set dari hasil konversi
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof  Manager){
            Manager manager = (Manager)  employee;
            System.out.println("Hello Manager" + manager.name);
        }
        else{
            System.out.println("Hello" + employee.name);
        }



    }
}
