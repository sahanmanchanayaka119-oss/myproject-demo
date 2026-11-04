public class demo1 {

    
    public static void main(String args[]) {
  
        System.out.println("ICBT");//java output
        System.out.println("Kurunagala");
        System.out.println("HD IT");
        System.out.println("OOP");
        
        //work with variables
        
        String name="Kasun";//store text
       char character='A' ;//store a character
       int number= 48;//only integer types
       double price =45.69;//specifically for two decimal places
       float distance=45.83746f;//specifically for more than two decimal places
       boolean result=true;//booean result
       boolean result1=false;
       System.out.println (name);
       System.out.println(price);
       System.out.println(distance);  
        System.out.println(number);
        //string concatenation
        String fName="Mahesh";
        String lName="Silva";
        System.out.println (fName+" "+lName);
        
        int marks1=48;
        int marks2=70;
        int total=marks1+marks2;
        System.out.println("Final total is:"+total);
        
        double value= 450.00;
        int quantity=8;
        double amount=value*quantity;
        System.out.println("Final amount is:"+String.format("%.2f", amount));
        
                
    }                           
}
