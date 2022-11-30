import java.util.*;

public class employee extends aadhar {

    String emp_name;
    double emp_ID;
    char emp_gender;
    int emp_age;
    
    employee()
    {
        this.emp_name = this.name;
        this.emp_gender = this.gender;
        this.emp_age = this.age;
    }
    public void set_emp_details()
    {
        this.emp_name = this.name;
        this.emp_gender = this.gender;
        this.emp_age = this.age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your employee ID -> ");
        this.emp_ID = sc.nextDouble();
    }

    public void get_details()
    {
        System.out.println("Employee Name -> " + this.emp_name);
        System.out.println("Employee ID -> " + this.emp_ID);
        System.out.println("Employee Age -> " + this.emp_age);
        System.out.println("Employee Gender -> " + this.emp_gender);
    }
}
