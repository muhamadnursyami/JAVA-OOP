package programmer.zaman.now.data;

//artinya car adalah turunan dari Hasbrand.
//jadi siapa pun yang menggunakan interface car
//mau nggak mau harus membuat juga data data yang ada di HasBrand
//contoh pada file Avanza.java yang menggunakan interface Car
// Dibawah ini adalah implementasi multiple interfaces  antara interfaces Cars dengan interfaces
// HasBrand dan IsMaintenance yaitu cara turunannya mengggunakan kata kunci extends
public interface Car extends HasBrand, IsMaintenance {

    void drive();

    int getTier();

    default boolean isBig(){
        return false;
    }
}
