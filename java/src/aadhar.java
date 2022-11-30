import java.util.*;
public class aadhar {

    String name;
    int age;
    char gender;

    aadhar()
    {
        System.out.println("Aadhar card Accessed");
    }

    public void set_details()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name -> ");
        this.name = sc.nextLine();
        System.out.println("Enter your age -> ");
        this.age = sc.nextInt();
        System.out.println("Enter your gender(M/F) ->");
        this.gender = sc.next().charAt(0);

    }

    public void get_details() {
        System.out.println("Name -> " + this.name);
        System.out.println("Age -> " + this.age);
        System.out.println("Gender -> " + this.gender);
    }

}
