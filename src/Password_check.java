import java.util.Scanner;


public class Password_check {
	
	
public static void main(String[] args) {
    int passwordLength=10, upChars=0, lowChars=0;
    int special=0, digits=0;
   
    
    char ch;
    Scanner s = new Scanner(System.in);
    System.out.println("Password should meet all the below criteria:");
    System.out.println("     1. Password length should be 10 or above 10.");
    System.out.println("     2. Password should contain 1 lowercase alphabet.");
    System.out.println("     3. Password should contain atleast 2 digits of number.");
    System.out.println("     4. Password should contain '$' or '#' in the last position.");
    System.out.println("Starting123");
    System.out.println("\n\nEnter the Password: ");
    String password = s.nextLine();
    
    
    int total = password.length();
    if(total<passwordLength)
    {
       System.out.println("\nThe Password Length should be atleast 10");
       return;
    }
    else
    {
       for(int i=0; i<total; i++)
       {
          ch = password.charAt(i);
          if(Character.isUpperCase(ch))
             upChars = 1;
          if(Character.isLowerCase(ch))
             lowChars = 1;
          else if(Character.isDigit(ch))
             digits++;
          else
             special = 1;
       }
    }
    boolean a=	password.endsWith("$");	
    boolean b=	password.endsWith("#");
    
    if( upChars!=0 && lowChars!=0 && digits>=2 )
    {
    	if(a==true || b==true) {
    	 System.out.println("\nThe Password is Strong.");
    }
    	else {
    		System.out.println("\nThe password must contain '$' or '#' in the last position.");
    	}
   } 
    else
    {
    	if(upChars==0)
            System.out.println("\nThe Password must contain at least one uppercase character.");
         if(lowChars==0)
            System.out.println("\nThe Password must contain at least one lowercase character.");
         if(digits<2)
            System.out.println("\nThe Password must contain at least Two digit.");
         
        
    }
     
    
 }


}
	

	


