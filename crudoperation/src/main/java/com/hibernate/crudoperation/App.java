package com.hibernate.crudoperation;


import com.hibernate.crudoperation.model.Employee;
import com.hibernate.employeedao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        EmployeeDao ed=new EmployeeDao();
//      Employee em=new Employee("Priyanka",50000);
//        ed.saveEmployee(em);
//       Employee em1=new Employee("Sonam",30000);
//   ed.saveEmployee(em1);
//     Employee em2=new Employee("Maya",20000);
//   ed.saveEmployee(em2);
        ed.updateRecord( "sham",1);
    }
}
