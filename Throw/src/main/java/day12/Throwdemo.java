package day12;

import java.io.IOException;

class Throwdemo {

   
  void testMethod(int num) throws IOException, ArithmeticException{ 
     if(num==1)
        throw new IOException("IOException Occurred");
     else
        throw new ArithmeticException("ArithmeticException");
  } 
}
class Main{ 
  public static void main(String args[]){ 
   try{ 
     
     Throwdemo td= new Throwdemo(); 
     td.testMethod(1); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
  }
}