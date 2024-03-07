package DTA;

public class GreedyAlg {

    
    // find second largest number in given array:
    // input: [1,2,3,4,5]
    // output: 4
    // input: [1,2,3,4,5,6]
    // output: 5
    // input: [1,2,3,4,5,6,7]
    // output: 6
    public static int findSecondLargest(    
        int [] values
    ){
        if(values.length<2) throw new IllegalArgumentException("Invalid Input");
        int max = Math.max(values[0], values[1]);
        int secondMax = Math.min(values[0], values[1]);
        for(int i = 2; i < values.length;i++){
            if(max < values[i]){
               max = values[i];
               secondMax = max;
            }else{
               secondMax = Math.max(secondMax, values[i]) ;
            }
        }
        return secondMax;
         
    }

    // write function to find largest subarray:
    // input: [1,2,3,4,5]
    // output: [1,2,3,4,5]

    // input: [1,2,3,4,0]
    // output: [1,2,3,4]

    // input: [1,2,5,4,6]
    // output: [1,2,5]
    // input: [1,2,5,4,6,7,8]
    // output: [4,6,7,8]

    public static int [] findLargestSubarray(
        int [] values
    ){
        int startIndx =0;
        int endIndx =0;

        int preStartIndx =0;
        int preEndIndx =0;
        int len = 0;
        int maxLen = 0;
        if(values.length==1) return new int[]{startIndx, endIndx};

        for (int i=0 ; i < values.length-1; i++) {
            if(values[i]<= values[i+1]){
                len++;
                endIndx = i+1;
            }else{
               if(len> maxLen){
                    preStartIndx = startIndx;
                    preEndIndx = endIndx;
               }
                maxLen = Math.max(maxLen, len);
               // reset
               len =0;
               startIndx = i+1;
            }
        }
        return (len> maxLen)?
            new int[]{startIndx,endIndx}: new int[]{preStartIndx,preEndIndx};
        //return new int[]{preStartIndx,preEndIndx};
    }
    static public void printArray(int [] arr){
        // print array:
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.print("\n");

    }
   
    // write test for above function:
    public static void main(String[] args) {
        // int [] values = {1,2,3,4,5,6,7};
        // System.out.println(findSecondLargest(values));
        // int [] values2 = {1,2,3,4,5};
        // System.out.println(findSecondLargest(values2));
        // int [] values3 = {1,2,3,4,5,6};
        // System.out.println(findSecondLargest(values3));
        // int [] values4 = {1,2,3,4,5,6,7,8,9,10};
        // System.out.println(findSecondLargest(values4));
        // int [] values5 = {1,2,3,19,20,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        // System.out.println(findSecondLargest(values5));

        int [] values = {1,2,3,4,5};
        printArray(findLargestSubarray(values));
        int [] values2 = {1,2,3,4,0};
        printArray(findLargestSubarray(values2));
        //System.out.println(findLargestSubarray(values2));
        int [] values3 = {1,2,5,4,6};
        printArray(findLargestSubarray(values3));
        // System.out.println(findLargestSubarray(values3));
        int [] values4 = {1,2,5,4,6,7,8};
        printArray(findLargestSubarray(values4));
        // System.out.println(findLargestSubarray(values4));

    }
    
}
