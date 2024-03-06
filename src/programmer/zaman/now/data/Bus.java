package programmer.zaman.now.data;

public class Bus implements Car{
    public void drive() {
        System.out.println("Bus Drive");
    }


    public int getTier() {
        return 8;
    }


    public String getBrand() {
        return "Hino";
    }


    public boolean isMaintenance() {
        return false;
    }
//    Ini tidak wajib, jika mau dibutuhkan aja karena ini dibuat default
    public boolean isBig() {
        return  true;
    }
}

