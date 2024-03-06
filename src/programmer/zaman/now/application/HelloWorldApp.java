package programmer.zaman.now.application;

import programmer.zaman.now.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

//ini namanya dalah anonymous Class
//        dia langsung menulis new HelloWorld(){
//        ....... sesuai data yang di interface HelloWorld
//        }
        HelloWorld english = new HelloWorld() {

            public void sayHello() {
                System.out.println("Hello");
            }


            public void sayHello(String name) {
                System.out.println("Hello" + name);
            }
        };
     english.sayHello();
     english.sayHello("Eko");
    }

}
