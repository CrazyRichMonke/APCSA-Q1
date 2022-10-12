public class Hailstone{
    public static void main(String[]args){
        int startNum = 1;
        int numOfCycles = 0;
        while (startNum <= 200){
            int endNum = startNum;
            do {
                if(endNum % 2 == 0){
                    endNum /= 2;
                }else{
                    endNum =  (endNum * 3)+ 1;
                }
                numOfCycles ++;
            } while (endNum != 1);
            System.out.println("There is " +numOfCycles+ " cycles");
            startNum++;
        }
    }
}
// Yes, 1-200 reach this cycle
