package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class CompanyApp {
    public static void main(String[] args) {


        Company company = new Company();
        company.setName("PZN");

//        Cara mengakases class Employye kita perlu mengakses dari objek company diatas
        Company.Employee employee = company.new Employee();
        employee.setName("Joko");
//    berikut cara akses nya yang telah menggunakan ineer class,
//        kita bisa mengakses data company dan menaruhnya kedalam get employee
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

    }
}
