package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApp {

    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setName("Eko");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

//        untuk mengambil nilai namenya, function name itu udah ada dari sana
        String levelName = Level.VIP.name();
        System.out.println(levelName);

//        mengkonversi apa ada ADA PREMIUM, jika mengirirm ada yang tidakada dalam option
//        enum classs level maka akan error
        Level level  = Level.valueOf("PREMIUM");

//        Untuk mengecek semua data pada level
        System.out.println(level);

        for (var value :  Level.values()){
            System.out.println(value);
        }
    }
}
