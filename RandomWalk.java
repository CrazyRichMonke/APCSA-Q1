public class RandomWalk {

    public static int simulateWalk() {
        final double startPos = 3.5; 

        double endPos = startPos;
        int numSteps = 0;

        while (endPos < 7 && endPos > 0) {   
            int randomInt = (int) (Math.random() * 2);
            if (randomInt == 0) {
                endPos += 1.0;
            } else {
                endPos -= 1.0;
            }
            numSteps += 1;
        }
        return numSteps;
    }

    public static double max(double... n) {
        int i = 0;
        double max = n[i];
    
        while (++i < n.length)
            if (n[i] > max)
                max = n[i];
    
        return max;
    }

    public static void main(String args[]) {
        int trial1 = RandomWalk.simulateWalk();
        int trial2 = RandomWalk.simulateWalk();
        int trial3 = RandomWalk.simulateWalk();
        int trial4 = RandomWalk.simulateWalk();
        int trial5 = RandomWalk.simulateWalk();
        int trial6 = RandomWalk.simulateWalk();
        int trial7 = RandomWalk.simulateWalk();
        int trial8 = RandomWalk.simulateWalk();
        int trial9 = RandomWalk.simulateWalk();
        int trial10 = RandomWalk.simulateWalk();
        int trial11 = RandomWalk.simulateWalk();
        int trial12 = RandomWalk.simulateWalk();
        int trial13 = RandomWalk.simulateWalk();
        int trial14 = RandomWalk.simulateWalk();
        int trial15 = RandomWalk.simulateWalk();
        int trial16 = RandomWalk.simulateWalk();
        int trial17 = RandomWalk.simulateWalk();
        int trial18 = RandomWalk.simulateWalk();
        int trial19 = RandomWalk.simulateWalk();
        int trial20 = RandomWalk.simulateWalk();
        int trial21 = RandomWalk.simulateWalk();
        int trial22 = RandomWalk.simulateWalk();
        int trial23 = RandomWalk.simulateWalk();
        int trial24 = RandomWalk.simulateWalk();
        int trial25 = RandomWalk.simulateWalk();
        int trial26 = RandomWalk.simulateWalk();
        int trial27 = RandomWalk.simulateWalk();
        int trial28 = RandomWalk.simulateWalk();
        int trial29 = RandomWalk.simulateWalk();
        int trial30 = RandomWalk.simulateWalk();
        int trial31 = RandomWalk.simulateWalk();
        int trial32 = RandomWalk.simulateWalk();
        int trial33 = RandomWalk.simulateWalk();
        int trial34 = RandomWalk.simulateWalk();
        int trial35 = RandomWalk.simulateWalk();
        int trial36 = RandomWalk.simulateWalk();
        int trial37 = RandomWalk.simulateWalk();
        int trial38 = RandomWalk.simulateWalk();
        int trial39 = RandomWalk.simulateWalk();
        int trial40 = RandomWalk.simulateWalk();
        int trial41 = RandomWalk.simulateWalk();
        int trial42 = RandomWalk.simulateWalk();
        int trial43 = RandomWalk.simulateWalk();
        int trial44 = RandomWalk.simulateWalk();
        int trial45 = RandomWalk.simulateWalk();
        int trial46 = RandomWalk.simulateWalk();
        int trial47 = RandomWalk.simulateWalk();
        int trial48 = RandomWalk.simulateWalk();
        int trial49 = RandomWalk.simulateWalk();
        int trial50 = RandomWalk.simulateWalk();
        double sum = trial1 + trial2 + trial3 + trial4 + trial5 + trial6 + trial7 + trial8 + trial9 + trial10 + 
        trial11 + trial12 + trial13 + trial14 + trial15 + trial16 + trial17 + trial18 + trial19 + trial20 + 
        trial21 + trial22 + trial23 + trial24 + trial25 + trial26 + trial27 + trial28 + trial29 + trial30 +
        trial31 + trial32 + trial33 + trial34 + trial35 + trial36 + trial37 + trial38 + trial39 + trial40 +
        trial41 + trial42 + trial43 + trial44 + trial45 + trial46 + trial47 + trial48 + trial49 + trial50;
        double average = sum / 50;
        System.out.println("The average amount of steps is " + average + " steps.");
        double maximum = RandomWalk.max(trial1, trial2, trial3, trial4, trial5, trial6, trial7, trial8, trial9, trial10,
        trial11, trial12, trial13, trial14, trial15, trial16, trial17, trial18, trial19, trial20, 
        trial21, trial22, trial23, trial24, trial25, trial26, trial27, trial28, trial29, trial30, 
        trial31, trial32, trial33, trial34, trial35, trial36, trial37, trial38, trial39, trial40, 
        trial41, trial42, trial43, trial44, trial45, trial46, trial47, trial48, trial49, trial50);
        System.out.println("The maximum amount of steps is " + maximum + " steps.");
    }
} 
