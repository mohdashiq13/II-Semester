import java.util.*;

public class CO2P2{
	public static int searchArray(int x[], int xc){
		int s=x.length, loc=-1;
		for(int i=0; i<s; i++){
			if(x[i] == xc){
				loc = i;
				break;
			}
		}
		return loc;
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int search;
		int num[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,114,112123,1212};
		for(int i=0; i<num.length; i++)
			System.out.print(num[i]+" ");
		System.out.print("\nEnter the Number to Search:");
		search=sc.nextInt();
		if(searchArray(num,search)>0)
			System.out.println("Found at Position:"+searchArray(num,search));
		else
			System.out.println("Not Found:");
	}
}