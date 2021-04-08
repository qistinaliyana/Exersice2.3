import java.util.*;
public class Perfume {
    String Brand;
    String Model;
    int ML;
    String MadeIn;
    String Colour;
    
    Scanner s = new Scanner(System.in);
     
      void printperfumeScanner() {
    	  System.out.println("Enter the Brand : ");
    	  String B = s.nextLine();
    	  System.out.println("Enter the Model : ");
    	  String M = s.nextLine();
    	  System.out.println("Enter the ML : ");
    	  int m = s.nextInt(); 
    	  System.out.println("Enter Made In : ");
    	  String I = s.next();
    	  System.out.println("Enter the Colour : ");
    	  String C = s.next();
    	    
    	  System.out.println("Brand : " + B);
      	  System.out.println("Model : " + M );
      	  System.out.println("ML : " + m + "ML");
      	  System.out.println("Made in : " + I); 
      	  System.out.println("Colour : " + C );
          System.out.println("\n--next--");
      }
      void calQuantity() {
    	  System.out.println("Enter the price : RM ");
    	  double p1 = s.nextDouble();
      	  System.out.println("Enter the quantity item : ");
      	  int item1 = s.nextInt();
      	
          int totalItem = (int) (item1 * p1) ;
          System.out.println("Total price item : RM " + totalItem); 
          System.out.println("\n--next--");
      }
      
      void calDiscountprice(double precentage) {
    	  System.out.println("Enter total price item : RM ");
     	  double p1 =s.nextDouble();
    	  System.out.println("Enter discount : RM ");
    	  double d1 =s.nextDouble();
     	  
    	  double discount = p1 * (d1 / precentage);
    	  System.out.println("Discount = RM " + discount);
    	  System.out.println("\n--next--");
      }
      void calTotalprice() {
    	 System.out.println("Enter total discount : RM ");
   	 double d2 =s.nextDouble();
    	 System.out.println("Enter total price item : RM ");
    	 double p2 =s.nextDouble();
    	 
    	 double totalprice = p2 - d2 ;
    	 System.out.println("Total price not include delivery = RM " + totalprice);
    	 System.out.println("\n--next--");
     }
     void calDeliveryprice() {
    	 System.out.println("Enter the total price (not include delivery) : RM ");
    	 double p3 = s.nextDouble();
    	 
    	 System.out.println("1 for COD, 2 for Delivery : ");
    	 int user = s.nextInt();
    	  if (user == 1) {
    		  System.out.println("COD : RM 5");
    		  p3 = p3 + 5;
    		  System.out.println("Final payment :  RM " + p3);
    	  }
    	  if (user == 2) {
    		  System.out.println("Delivery fee : RM 15");
    		  p3 = p3 + 15;
    		  System.out.println("Final payment : RM " + p3);
    	  } 
    }   
}
