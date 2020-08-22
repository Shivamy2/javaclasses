package src.com.getter;

public class StudentData {
    int roll;
    String name;
    long mobileNo;
    String email;

        // no argumnet constructor
    public StudentData() {
        roll = 34;
        name = "Shivam";
        mobileNo = 700772325;
        email = "sy7052789@gmail.com";
    }
        // parameterzied constructor
    public StudentData(int roll, String name, long mobileNo, String email) {
        this.roll = roll;
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    // getter for roll no assignment
    public int getRoll() {
        return roll;
    }

    // setting the value thorugh setter
    public int setRoll(int roll) {
        this.roll = roll;
        return roll;
    }

    
   }
