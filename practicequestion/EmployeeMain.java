package practicequestion;

import java.util.Scanner;
import practicequestion.employeeq.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] obj = new Employee[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs you want ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {

            System.out.println("Enter FirstName");
            String firstname = sc.nextLine();
            System.out.println("Enter LastName");
            String lastname = sc.nextLine();
            System.out.println("Enter Email");
            String email = sc.nextLine();
            System.out.println("Enter Salary");
            int salary = sc.nextInt();
            System.out.println("Enter Mobile Number");
            long mobileno = sc.nextLong();
            System.out.println("Enter Experience");
            int empexp = sc.nextInt();
            System.out.println("Enter Employee Id");
            int empid = sc.nextInt();
            sc.nextLine();
            if (i < n) {
                obj[i] = new Employee(firstname, lastname, email, salary, empid, empexp, mobileno);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("\nEmployee " + (i+1) +  " values are: ");
            obj[i].Display();
        }
        if (sc != null) {
            sc.close();   
        }
    }

}