package programmer.zaman.now.data;

import programmer.zaman.now.application.CompanyApp;

public class Company {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee {
        private String name;

//        Cara mengambil method dari class Inner atau class company menggunakan kata kunci this
        public String getCompany (){
//            return  Company.this.getName(); bisa juga
    return Company.this.name;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
