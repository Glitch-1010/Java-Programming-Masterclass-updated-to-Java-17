public class PositiveNegativeZero {
    // write code here
    public static void checkNumber (int number){
        if(number>0){
        System.out.println("positive");  
        }
         
//checks the number is less than 0 or not  
        else if(number<0)  
        {  
        System.out.println("negative");  
        }  
//executes when the above two conditions return false  
        else  
        {  
        System.out.println("zero");  
        }
    }
}
