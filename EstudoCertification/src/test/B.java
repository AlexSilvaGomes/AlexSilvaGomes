package test;


 class A{
  public A get(){
    System.out.print(1);
    return this;
  }	
}

public class B extends A{
  private B getSuper(){
    A a = super.get();
    if(a instanceof B){
      System.out.print(2);
      return (B)a;
    }
    System.out.print(3);
    return new B();
  }
	
  public B get(){
    B b;
    try{
      b = (B)super.get();
      System.out.print(4);
    }catch(Exception e){
      b = getSuper();
        System.out.print(5);
    }
      return b;
  }
	
    public static void main(String args[]){
     B b = new B();
     b.get();
    }

}

				
