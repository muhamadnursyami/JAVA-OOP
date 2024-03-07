package programmer.zaman.now.application;

import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.data.Product;

@Fancy(name ="App", tags = {"apli", "java"})
public class Application {
    public static void main(String[] args) {

        Product product = new Product("Budi", 42131313);
//        System.out.println(product.name); tidak bisa di akses karena tipe data dari variabel name protected hanya bisa di akses di package yang samaa
//        System.out.println(product.price);

    }
}
