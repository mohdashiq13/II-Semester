import java.util.*;

public class CO2P3 {
	public static void main (String[] args){
		Scanner value = new Scanner(System.in);
		System.out.print("Enter the String 1:");
		String var1 = value.nextLine();
		System.out.print("Enter the String 2:");
		String var2 = value.nextLine();
		
		System.out.println(var1 + " " + var2);
		
		System.out.println(var1.concat(var2));
		
		if (var1 == var2)
		{
			System.out.println("Strings are same");
		}
		else
		{
			System.out.println("Strings are not same");
		}
		
		System.out.println(var1.equals(var2));
		
		System.out.println(var1.length());
		
		int var3 = var1.length();
		int var4 = var2.length();
		
		if (var3 == var4)
		{
			System.out.println("length is same");
		}
		else
		{
			System.out.println("length are not same");
		}
		
		System.out.println("To Upper Case: " + var1.toUpperCase());
		
		System.out.println("Enter string that is to located: ");
		String var5 = value.nextLine();
	
		System.out.println(var1.indexOf(var5));
		
		System.out.println(var1.substring(0,2));
	}
}