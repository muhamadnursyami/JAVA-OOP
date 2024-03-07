package programmer.zaman.now.data;

import java.beans.SimpleBeanInfo;

public enum Level {
//    Kebiasaanya Huruf BESAR
//    saaat kita membuat sebuah constructor dalam enum class]
//    pada pada option STANDARN PREMIUM DAN VIP
//    kita harus memanggilnya dengan menggunakan constructor untuk discription
//    STANDARD, PREMIUM, VIP
//    Perbaiki  penulisan option diatas yaitu STANDARD , PREMIUM, VIP setelah ada constructor
    STANDARD("standar  level"), PREMIUM("Premium Level"), VIP("VIP Level");





//    Menambahkan Constructor Pada Enum Class
//    Consttructor pada enum class dtidak bisa diset public

    private String  description;

    Level(String description) {
            this.description = description;
    }
    public  String  getDescription(){
        return  description;
    }

}
