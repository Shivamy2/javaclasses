package practicequestion;

import java.util.Scanner;
import practicequestion.employeeq.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] obj = new Employee[5];
        Scanner sc = new Scanner(System.in);
        Employee responseData = new sortSalaryOrder(obj);
        System.out.println(obj.toString());
        System.out.println("Enter the number of inputs you want ");
        for (int i = 0; i < obj.length; i++) {
            sc.nextLine();
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
            
            obj[i] = new Employee(firstname, lastname, email, salary, empid, empexp, mobileno);
            
        }

        for (int i = 0; i < obj.length; i++) {
            System.out.println("\nEmployee " + (i+1) +  " values are: ");
            obj[i].Display();
        }
    }
    //method to in descending order
                public static Employee[] sortSalaryOrder(Employee[] obj) {
                    //creating clone array i.e making a new object from that array    
                    Employee[] response = obj.clone();
                    for (int i = 0; i < response.length; i++) {
                        for (int j = 0; j < response.length - 1; j++) {
                            //compare the first element with second
                            //if first element is smaller then second will be swaped
                            if (response[j].getSalary() < response[j+1].getSalary()) {
                                Employee temp = response[j];
                                response[j] = response[j+1];
                                response[j+1] = temp;   
                            }
                        }
                    }
                    return response;
                }


}