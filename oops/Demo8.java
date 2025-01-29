class Bank{
    Bank(){}
 public void roi(){
   System.out.println("10%");
}
}
class SBI extends Bank{

}
class Axis extends Bank{
	public void roi(){
 System.out.println("12%");
}
}
class Demo8{
       public static void main(String agrs[]){
        Bank b=new Bank();
        b.roi();
        Axis a=new Axis();
        a.roi();
      
}
}