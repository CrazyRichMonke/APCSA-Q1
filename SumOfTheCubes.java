/**   
Subhy Alam 
9/13/22
Tappan Zee High School
*/
import java.util.*;
public class SumOfTheCubes {
    public static void main(String[]args){
        Scanner get = new Scanner(System.in);
        int sum = 0;
        int a;
        System.out.println("Give me a number: ");
        int n = get.nextInt();
        get.close();
        while(n>0){
        a = n % 10;
        sum = a*a*a+sum;
        n = n/10;
        }
        System.out.println("sum = " + sum);
        


        



    }
    
}
