package programmer.zaman.now.data;


public record LoginRequest(String username, String password) {
//    constructor record tanpa tanda ()
//bacanya : jika constructor String username, dan String password dipanggil
//jalankan loginRequsest dibawah ini
    public LoginRequest {
        System.out.println("Membuat object LoginRequest");
    }

//    constructor overloading pada record
//    wajib harus manggil constructor utama yaitu String usernaem dan String passowrd
    public LoginRequest(String username){
        this(username, "");
    }

    public LoginRequest(){
        this("","");
    }


}
