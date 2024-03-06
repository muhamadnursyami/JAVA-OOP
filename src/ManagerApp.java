public class ManagerApp {
    public static void main(String[] args) {
//        Class Parent
        var manager = new Manager("KI");

        manager.name ="Syami";
        manager.sayHello("Budi");


//        Class Child
        var vicePresident = new VicePresident("BO");
        vicePresident.name = "Eko";
        vicePresident.sayHello("Joko");
    }
}
