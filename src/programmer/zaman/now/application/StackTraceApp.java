package programmer.zaman.now.application;

public class StackTraceApp {
    public static void main(String[] args) {
//Pelajaran sebelumnya
//        try {
//            String[] names ={
//                    "Muhamad", "Nur", "Syami"
//            };
//
//            System.out.println(names[100]);
//        }catch (Throwable error){
//                StackTraceElement[] stackTraceElements = error.getStackTrace();
////                atau juga bisa langsung seperti ini
//            error.printStackTrace();
//        }

//        Memanggil method di bawah
        try{
            sampleError();

        }
        catch (RuntimeException error){
    error.printStackTrace();
        }
    }

    public static  void sampleError(){
        try {
            String[] names ={
                    "Muhamad", "Nur", "Syami"
            };

            System.out.println(names[100]);
        }catch (Throwable error){
           throw  new RuntimeException(error);
        }
    }

}
