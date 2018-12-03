
import javax.swing.JOptionPane;
class ex4{


 public static void main(String[] args) {
  int n=Integer.parseInt(args[0]);
  if(n>1){  
    while(n !=1){ //n factorial 
      if(n%2==0){ // si X es divisible por 2
      System.out.println(n);
      n=n/2;
                }
      else{
	System.out.println(n);
	n=(n*3)+1;
	
          }
               }
       }  
   else{
     System.out.println("1");
   }                            
                                      }
}