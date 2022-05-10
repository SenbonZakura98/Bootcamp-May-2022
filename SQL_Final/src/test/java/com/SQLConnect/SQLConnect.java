package com.SQLConnect;

import org.testng.annotations.Test;

import java.sql.*;

public class SQLConnect {

    @Test
    public void getCountriesData()  {
try {
    Class.forName("com.mysql.cj.jdbc.Driver");//
    System.out.println("Driver Loaded");

//Set Connection to your DataBase
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?serverTimezone=UTC", "root", "abcd1234");
    System.out.println("Connected to mySQL DB");


//--Create Statement
    Statement stmnt = con.createStatement();

//Write Quarry
    String query = "SELECT * FROM employee.countries LIMIT 5";

//--Execute Quarry
    ResultSet rset = stmnt.executeQuery(query);
    System.out.println("country_id"+"\t\t"+"country_name"+"\t"+"region_id");
    while(rset.next()) {
        System.out.println(
               rset.getString("country_id")+ "\t\t\t\t"
               +rset.getString("country_name")+ "\t\t\t"
                +rset.getInt("region_id")
        );

        System.out.println("");
    }
    }
catch (Exception e){
    System.out.println(e.getMessage());
    e.printStackTrace();
}
    }
@Test
public void getDepartmentsData(){


    try {
        Class.forName("com.mysql.cj.jdbc.Driver");//
        System.out.println("Driver Loaded");

//Set Connection to your DataBase
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?serverTimezone=UTC", "root", "abcd1234");
        System.out.println("Connected to mySQL DB");


//--Create Statement
        Statement stmnt = con.createStatement();

//Write Quarry
        String query = "SELECT * FROM employee.departments limit 5";

//--Execute Quarry
        ResultSet rset = stmnt.executeQuery(query);
        System.out.println("department_id"+"\t"+"department_name"+"\t\t"+"location_id");
        while(rset.next()) {
            System.out.println(
                    rset.getInt("department_id")+ "\t\t\t\t"
                            +rset.getString("department_name")+ "\t\t\t"
                            +rset.getInt("location_id")

            );
            System.out.println("");
        }


    }
    catch (Exception e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}
@Test
public void getDependantsData(){

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");//
        System.out.println("Driver Loaded");

//Set Connection to your DataBase
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?serverTimezone=UTC", "root", "abcd1234");
        System.out.println("Connected to mySQL DB");


//--Create Statement
        Statement stmnt = con.createStatement();

//Write Quarry
        String query = "SELECT * FROM employee.dependents limit 5";

//--Execute Quarry
        ResultSet rset = stmnt.executeQuery(query);
        System.out.println("dependent_id"+"\t"+"first_name"+"\t\t"+"last_name"+"\t\t"+"relationship"+"\t\t"+"employee_id"+"\t\t");
        while(rset.next()) {
            System.out.println(
                    rset.getInt("dependent_id")+ "\t\t\t\t"
                            +rset.getString("first_name")+ "\t\t"
                            +rset.getString("last_name")+ "\t\t\t"
                            +rset.getString("relationship")+ "\t\t"
                            +rset.getInt("employee_id")+ "\t\t\t"


            );

            System.out.println("");
        }
    }
    catch (Exception e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }


}


@Test
public void getEmployeesData(){


    try {
        Class.forName("com.mysql.cj.jdbc.Driver");//
        System.out.println("Driver Loaded");

//Set Connection to your DataBase
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?serverTimezone=UTC", "root", "abcd1234");
        System.out.println("Connected to mySQL DB");


//--Create Statement
        Statement stmnt = con.createStatement();

//Write Quarry
        String query = "SELECT * FROM employee.employees LIMIT 5";

//--Execute Quarry
        ResultSet rset = stmnt.executeQuery(query);
System.out.println("employee_id"+"\t"+"first_name"+"\t\t"+"last_name"+"\t\t\t"+"email"+"\t\t"+"phone_number"+"\t\t"+"hire_date"+"\t\t"+"job_id"+"\t\t"+"salary"+"\t\t"+"manager_id"+"\t\t"+"department_id");
        while(rset.next()) {
            System.out.println(
                    rset.getInt("employee_id")+ "\t"
                            +rset.getString("first_name")+ "\t\t\t"
                            +rset.getString("last_name")+ "\t\t\t"
                            +rset.getString("email")+ "\t\t\t"
                            +rset.getString("phone_number")+ "\t\t\t"
                            +rset.getDate("hire_date")+ "\t\t\t"
                            +rset.getInt("job_id")+ "\t\t\t"
                            +rset.getBigDecimal("salary")+ "\t\t\t"
                            +rset.getInt("manager_id")+ "\t\t\t"
                            +rset.getInt("department_id")+ "\t\t\t"
            );

            System.out.println("");
        }
    }
    catch (Exception e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }

}



@Test
public void getJobsData(){

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");//
        System.out.println("Driver Loaded");

//Set Connection to your DataBase
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?serverTimezone=UTC", "root", "abcd1234");
        System.out.println("Connected to mySQL DB");


//--Create Statement
        Statement stmnt = con.createStatement();

//Write Quarry
        String query = "SELECT * FROM employee.jobs LIMIT 5";

//--Execute Quarry
        ResultSet rset = stmnt.executeQuery(query);
        System.out.println("job_id"+"\t"+"job_title"+"\t\t\t\t"+"min_salary"+"\t\t"+"max_salary");
        while(rset.next()) {
            System.out.println(
                    rset.getInt("job_id")+ "\t\t"
                            +rset.getString("job_title")+ "\t\t"
                            +rset.getBigDecimal("min_salary")+ "\t\t\t"
                            +rset.getString("max_salary")+ "\t\t"



            );

            System.out.println("");
        }
    }
    catch (Exception e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}




@Test
public void getLocationData(){

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");//
        System.out.println("Driver Loaded");

//Set Connection to your DataBase
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?serverTimezone=UTC", "root", "abcd1234");
        System.out.println("Connected to mySQL DB");


//--Create Statement
        Statement stmnt = con.createStatement();

//Write Quarry
        String query = "SELECT * FROM employee.locations LIMIT 5";

//--Execute Quarry
        ResultSet rset = stmnt.executeQuery(query);
        System.out.println("location_id"+"\t"+"street_address"+"\t\t\t\t"+"postal_code"+"\t\t"+"city"+"state_province"+"\t\t"+"country_id"+"\t\t");
        while(rset.next()) {
            System.out.println(
                    rset.getInt("location_id")+ "\t\t"
                            +rset.getString("street_address")+ "\t\t"
                            +rset.getString("postal_code")+ "\t\t\t"
                            +rset.getString("city")+ "\t\t"
                            +rset.getString("state_province")+ "\t\t"
                            +rset.getString("country_id")+ "\t\t"



            );

            System.out.println("");
        }
    }
    catch (Exception e){
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}










}

