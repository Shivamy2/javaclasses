package practicequestion.employeeq;

public class Employee {
   String FirstName;
   String LastName;
   String Email;
   int Salary;
   long MobileNo;
   int EmployeeExp;
   int EmployeeId;

    public Employee(String FirstName, String LastName,String Email,int Salary,int EmployeeId,int EmployeeExp,long MobileNo) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Salary = Salary;
        this.EmployeeId = EmployeeId;
        this.EmployeeExp = EmployeeExp;
        this.MobileNo = MobileNo;
    }
    public void Display() {
        System.out.println(FirstName +"\n" + LastName + "\n" + Email + "\n" + Salary + "\n"+ EmployeeExp +"\n" + EmployeeId +"\n" + MobileNo);
    }
}