class CPU{
	int price;
	class Processor{
		int core;
		String manf;
	}
	static class RAM{
		int mem;
		String manf;
	}
}

public class CO1P5{
	public static void main(String []args){
		CPU obj = new CPU();
		CPU.Processor pro = obj.new Processor();
		CPU.RAM ram = new CPU.RAM();
		obj.price=12500;
		pro.core=8;
		pro.manf="Intel";
		ram.mem=16;
		ram.manf="Crucial";
		System.out.println("Processor Manufacturer:"+pro.manf);
		System.out.println("Processor Cores:"+pro.core);
		System.out.println("Processor Price:"+obj.price);
		System.out.println("RAM Memory:"+ram.mem);
		System.out.println("RAM Manufacturer:"+ram.manf);
	}
}