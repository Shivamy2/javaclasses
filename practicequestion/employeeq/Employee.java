package practicequestion.employeeq;

public class Employee {
   String FirstName;
   String LastName;
   String Email;
   int Salary;
   long MobileNo;
   int EmployeeExp;
   int EmployeeId;

   public int getSalary() {
       return Salary;
   }
   public int getEmployeeExp() {
       return EmployeeExp;
   }
    public Employee({
        this.FirstName,
        this.LastName,
        this.Email,
        this.Salary,
        this.EmployeeId,
        this.EmployeeExp,
        this.MobileNo
    });
    public void Display() {
        System.out.println(FirstName +"\n" + LastName + "\n" + Email + "\n" + Salary + "\n"+ EmployeeExp +"\n" + EmployeeId +"\n" + MobileNo);
    }
}