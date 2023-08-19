import java.util.Scanner;

class Employee{
    int empId, salary;
    String name, address;
    Employee(int E_id, String E_name, int E_salary, String E_address){
        empId = E_id;
        name = E_name;
        salary = E_salary;
        address = E_address;
    }
}

class Teacher extends Employee{
    String department;
    int subjectsTaught;
    Teacher(int uid, String nm, int sal, String ad, String dep, int subt){
        super(uid, nm, sal, ad);
        department = dep;
        subjectsTaught = subt;
    }

    public void displayItems(){
        System.out.println("ID: "+empId);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Address: "+address);
        System.out.println("Department: "+department);
        System.out.println("Subjects Taught: "+subjectsTaught);
    }
}
public class CO3P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Tid, Tsalary, Ttaught, n;
        String Tname, Taddress, Tdepartment;
        System.out.print("How many: ");
        n = sc.nextInt();
        Teacher[] obj = new Teacher[n];
        for (int i=0; i<n; i++){
            System.out.print("Name: ");
            Tname = sc.next();
            System.out.println("ID: "+(i+1));
            Tid = i+1;
            System.out.print("Salary: ");
            Tsalary = sc.nextInt();
            System.out.print("Address: ");
            Taddress = sc.next();
            System.out.print("Department: ");
            Tdepartment = sc.next();
            System.out.print("Subjects Taught: ");
            Ttaught = sc.nextInt();
            obj[i] = new Teacher(Tid, Tname, Tsalary, Taddress, Tdepartment, Ttaught);
        }
        for (int i = 0; i < n; i++) {
            obj[i].displayItems();
        }
    }
}
