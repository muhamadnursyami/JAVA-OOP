package programmer.zaman.now.data;

import java.util.Objects;

public class Product {
    protected String name;
    protected int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

//    Membuat sebuah method toString untuk mengoveriding data Product
//    yang jika tidak melakukan method toString, datany akan hashcode
//  silahkan coba scout  dengan menkoment kode diatas.
    public String toString(){
        return "Product name: " + name +" , price " + price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
