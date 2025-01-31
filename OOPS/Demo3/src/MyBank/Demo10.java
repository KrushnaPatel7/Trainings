package MyBank;
class Sbi extends Bank{

	@Override
	void ATM() {
		System.out.println("Master Card");
		
	}

	@Override
	void FD() {
		
		System.out.println("10%");
	}
	
}
class Axis extends Bank{

	@Override
	void ATM() {
		System.out.println("Platinum Card");
	}

	@Override
	void FD() {
		System.out.println("12%");
		
	}
	
}
public class Demo10 {
	public static void main(String args[]) {
		Sbi s= new Sbi();
		s.ATM();s.FD();
		Axis a = new Axis();
		a.ATM();a.FD();
	}
}
