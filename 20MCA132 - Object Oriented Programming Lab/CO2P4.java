import java.util.Scanner;
class Employee{
	int eNo,eSalary;
	String eName;
	Employee(int a, int b, String c){
		eNo=a;
		eSalary=b;
		eName=c;
	}
}
public class CO2P4{
	static Employee find(Employee e[], int xId){
		Employee flag = null;
		for(int i=0; i<3; i++){
			if(e[i].eNo == xId){
				flag=e[i];
				break;
			}
		}
		return flag;
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		Employee obj[] = new Employee[10];
		int id,sal;
		String nm;
		for(int i=0; i<3; i++){
			System.out.print("Enter Employee Name:");
			nm=sc.next();
			System.out.print("Enter Employee Salary:");
			sal=sc.nextInt();
			System.out.print("Enter Employee ID:");
			id=sc.nextInt();
			obj[i] = new Employee(id,sal,nm);
		}
		System.out.println("Search Employee:-");
		System.out.print("Enter the Employee ID:");
		id=sc.nextInt();
		Employee flag = find(obj,id);
		if(flag == null)
			System.out.println("Employee Not Found");
		else{
			System.out.println("Employee Found");
			System.out.println("Employee ID:"+flag.eNo);
			System.out.println("Employee Name:"+flag.eName);
			System.out.println("Employee Salary:"+flag.eSalary);
		}
	}
}