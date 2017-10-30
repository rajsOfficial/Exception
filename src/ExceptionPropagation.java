class Exceptn{  
  void m(){  
    int data=50/0;  
    int x=5;
    System.out.println("data is"+data + x);// content aftern exception is not used
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  // Exception propagated 
  }  
  public static void main(String args[]){  
   Exceptn obj=new Exceptn();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  