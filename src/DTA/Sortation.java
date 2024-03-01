package DTA;
public class Sortation {
    /*
     * 
     * implement quicksort
     * halving the array into partitions
     * 
     * pivoting partitions with pivot point 
     * (where all left elements smaller than the pivoting point)
     * right element greater than pivoting point
     * 
     */

    static void sort(int [] arr, int left, int right){
        // base case:
        if( arr.length == 1 || arr.length ==0){
            return;
        }
        if(left>= right) return;

        int povitIndex = pivotingPartition(arr,left,right);
        
        // sort left
        sort(arr, left, povitIndex -1);

        // sort right
        sort(arr, povitIndex+1, right);
    }

    static int pivotingPartition(int[] arr,int left, int right) {
        
        int pivotIndex = right;
        int pivotValue = arr[pivotIndex];
        // int left = 0;
        // int right = pivotIndex-1;
        
        // moving index pointer:
        while(true){
            // move left pointer to the right
            while(arr[left]< pivotValue){
                left++;
            }
            // move right pointer to the left
            while(arr[right]>pivotValue){
                right--;
            }
            if(left>= right){
                break;
            }else{
                swap(arr, left, right);    
                left++;
            }
        }
        // swap left value with pivot value
        swap(arr, left, pivotIndex);
        System.out.println("left:" + left);
        return left;

    }

    static void swap(int[] arr, int left, int right) {
        int temp  = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
        System.out.println("left"+ arr[left] + ", right:"+ arr[right]);
    }
    static void printArray(int []arr){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : arr) {
            stringBuilder.append(i+ ",");
        }
        System.out.println(stringBuilder.toString());        
    }
    public static void main(String[] args) {
        
        int [] arr  = {1,2,3,5,0};
        sort(arr, 0, arr.length-1);
        printArray(arr);
        // System.out.println(arr);
    }   
}
