// Class Parent
 class Shape {
    int getCorner(){
         return 0;
    }

}

// Class Child

class  Rectangle extends Shape {
//   pada class child ini, class Rectangle ini
//    telah menggunakan method getCorner yang ada di
//    class Shape sebagai kelas parent
//    tetapi data nya di ubah yaitu return nya diubah menjadi 4
//    jadi jika kita nanti panggil method getCorner mengunakan class
//    Rectangle maka returnnya itu adalah 4, karena sudah di ubah

    int getCorner(){
        return 4;
    }
//Jikalau kita ingin tetap mengambil nilai dari getCorner pada class parent
//    /class Shape, maka kita bisa buat method baru bernapa getParentCorner
//    kemudian kita ambil nilai dari class parent dengan menggunakan kata kunci
//    super , for example : return super.getCorner();
    int getParentCorner(){
        return super.getCorner();
    }
}

