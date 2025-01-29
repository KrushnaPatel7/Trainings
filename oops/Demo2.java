class Parent
{
           int site=1000;
           
}
class Child extends Parent
{
        int site =100;
        void display(int site)
      { 
         System.out.println("Site :"+site);
         System.out.println("Site :"+this.site);
         System.out.println("Site  :"+super.site);
	       }
}
class Demo2
{  	
	public static void main(String args[]){
	Child c=new Child();
        c.display(10);
      }
}
