// Create another class ‘Teacher’ that
// inherits the properties of class Employee and contains its own data members like Subject, Department, Teacherid and
// also contain constructors and methods to display the data members. Use array of objects to display details of N
// teachers.

import java.util.Scanner;

class Person{
    Scanner sc = new Scanner(System.in);
    String name, gender, address;
    int age;
    Person(){
        System.out.print("Person Name: ");
        name = sc.next();
        System.out.print("Person Gender: ");
        gender = sc.next();
        System.out.print("Person Address: ");
        address = sc.next();
        System.out.print("Person Age: ");
        age = sc.nextInt();
    }
}

class Employee extends Person{
    int empid, salary;
    String companyName, qualification;
    Employee(int eid){
        super();
        System.out.println("Employee ID: "+eid);
        empid = eid;
        System.out.print("Employee Salary: ");
        salary = sc.nextInt();
        System.out.print("Employee Comapny Name: ");
        companyName = sc.next();
        System.out.print("Employee Qualification: ");
        qualification = sc.next();
    }
}

class Teacher extends Employee{
    String subject, department;
    int tid;
    Teacher(int eid, int t_id){
        super(eid);
        System.out.println("Teaching ID: "+t_id);
        tid = t_id;
        System.out.print("Teaching Subject: ");
        subject = sc.next();
        System.out.print("Teaching Department: ");
        department = sc.next();
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Company: "+companyName);
        System.out.println("Employee ID: "+empid);
        System.out.println("Qualification: "+qualification);
        System.out.println("Salary: "+salary);
        System.out.println("Teaching Subject: "+subject);
        System.out.println("Teaching ID: "+tid);
        System.out.println("Department: "+department);
    }
}
public class CO3P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("How many: ");
        n = sc.nextInt();
        Teacher[] tobj = new Teacher[n];
        for (int i = 0; i < n; i++) {
            tobj[i] = new Teacher(i+1, i+100);
        }
        for (int i = 0; i < n; i++) {
            tobj[i].display();
        }
    }
}
