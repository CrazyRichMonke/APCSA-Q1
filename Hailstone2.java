public class Hailstone2 {
    public static void main(String[]args){
        for(int x = 1; x < 200; x++){
            int num = x;
                int num2 = num;
            int y = 1;
            while(num!= 1) {
                num2 = num;
                if(num%2 == 0){
                    num2 = num2/2;
                    num = num2;

                }else{
                    num2 = (3 * num + 1);
                    num = num2;
                }
                y++;
            }
        
        if(y > 123){
            System.out.println(x + " iterations");
        }
    }
}
}
// start num = 124, 
    

