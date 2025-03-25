public class LargeSmall {     
    public static void main(String args[]) {         
    int numbers[] = new int[]{55, 32, 42, 82, 11, 9};         int smallest = numbers[0];         
    int largest = numbers[0]; 
     
            for (int i = 1; i < numbers.length; i++) 
            { 
                if (numbers[i] > largest)  
                { 
                    largest = numbers[i]; 
                } else if (numbers[i] < smallest)  
                { 
                    smallest = numbers[i]; 
                } 
            } 
            System.out.println("Largest: " + largest); 
            System.out.println("Smallest: " + smallest); 
        } 
    } 
    