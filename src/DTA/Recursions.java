package DTA;

public class Recursions {
    
    
    /*
     * Context:
     * A stair case having number of steps
     * A person can jump with 1, 2, 3 steps at the time
     * Question:
     * 
     * find number of ways a person can claim to n-th stair
     * 
     */
    static int findNumbersOfSteps(
        
    
        int n
    ){

        // base case
        int res = 0;
        /*
         * Steps:
         * 1
         */
        if(n == 1) {
            res = 1;
            return res;
        } 
        /*
         * Steps:
         * 1,1
         * 2
         */
        if (n == 2){
            res = 2;
            return res;
        }
        /*
        take steps:
        1,1,1
        1,2
        2,1
        */ 

        if (n == 3){
            res = 3;
            return res;
        }
        /*
         * to climb step n-th, a person can
         * take 1 step from n-1 (th) stair
         * take 2 steps from n-2 (th) stair
         * take 3 step from n-3 (th) stair
         * 
         * 
         */
        res = findNumbersOfSteps(n-1) + findNumbersOfSteps(n-2) + findNumbersOfSteps(n-3);
        return res;

    }
    public static void main(String[] args) {
        int input = 1;
        int rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", result:" + rs );
        input = 2;
        rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", result:" + rs );
        input = 3;
        rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", result:" + rs );
        input = 4;
        rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", result:" + rs );
        input = 10;
        rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", result:" + rs );

        input = 15;
        rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", result:" + rs );
        
        input = 20;
        rs = findNumbersOfSteps(input);
        System.out.println("stair:" + input + ", result:" + rs );
    }
}
