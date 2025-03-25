import java.util.*; 
public class Temperature 
{ 
    public static void main(String args[]) 
    { 	 
        Scanner sc =new Scanner(System.in); 
        System.out.println("Enter the Temperature in Fahrenheit:");         int temperature= sc.nextInt(); 
 
        if(temperature<98f) 
        { 
            System.out.println("Temperaure is COlD!"); 
        } 
        else if(temperature>98f && temperature<150f) 
        { 
            System.out.println("Temperature is WARM!"); 
        }         else 
        { 
            System.out.println("Temperature is HOT!"); 
        } 
    } 
} 
