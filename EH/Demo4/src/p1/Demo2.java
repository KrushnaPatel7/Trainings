package p1;

interface Bank{
	void OT();
	void atm();
	void withdraw();
	default void zeroAcc() {
		//100 lines of logic
	}
	static void xyz() {
		//100 lines of logic
	}
}
class Sbi implements Bank{
	public void OT(){}
	public void atm(){}
	public void withdraw(){}
}
class Icici implements Bank{
	public void OT(){}
	public void atm(){}
	public void withdraw(){}
}
class Indian implements Bank{
	public void OT(){}
	public void atm(){}
	public void withdraw(){}
}
public class Demo2 {
 public static void main(String[] args) {
	 Sbi s=new Sbi();s.atm();s.OT();s.withdraw();s.zeroAcc();
	 //i.xyz();
	 Bank.xyz();
 }
 
}
