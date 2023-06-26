import java.util.*;

public class CO2P1{
	public static String sortString(String x){
		char txt[] = x.toCharArray();
		Arrays.sort(txt);
		return new String(txt);
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String text, sortText;
		System.out.print("Enter the Text:");
		text=sc.next();
		sortText=sortString(text);
		System.out.println("Sorted String:"+sortText);
	}
}