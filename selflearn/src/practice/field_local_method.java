package practice;

public class field_local_method {
   boolean field; 

   String data = "Field";
   
   public String show() {
       String data = "Local";
       return this.data;
   }
   
   public int data1 = 10;
   public void hoge(int data1) {
	   if(data1 <0) {
		   var hello = 0;
	   }
	   
	   System.out.println(data1);
   }
   
   
   
   
   
   
   
   
//   public void methodPractice(){
//	   
//	   
//	   
//      
//       
//       
//       boolean localVariable; 
//       System.out.println(field);
////       System.out.println(localVariable);
//       
//       
//   }
}
