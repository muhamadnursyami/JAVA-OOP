package programmer.zaman.now.data;

//ini akan error jika tidak menambahkan  method getBrand pada file HasBrand
//kenapa? karena car merupakan turunan dari HasBrand maka kita perlu tambahkan data data yang ada
//di HasBrand juga

public class Avanza implements  Car {
    public void drive() {
        System.out.println("Avanza drive");
    }


    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

//   isMaintenance diambil dari Interface Maintenance
    public boolean isMaintenance() {
        return false;
    }
}
