public class MaxMinInArray {

    /** Min and Max number in array using Tournament method(Divide array into two parts then find min and max)*/

    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMaxInArray(int arr[], int low, int high){

        Pair minMax=new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        int  mid;

        /** If there is only one element then return both low */

        if(low==high){
            minMax.min=arr[low];
            minMax.max=arr[low];
            return minMax;
        }

        /** If there are two elements */

        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minMax.max = arr[low];
                minMax.min = arr[high];
            } else {
                minMax.max = arr[high];
                minMax.min = arr[low];
            }
            return minMax;
        }
 
        /* If there are more than 2 elements */

        mid = (low + high) / 2;
        mml = getMinMaxInArray(arr, low, mid);
        mmr = getMinMaxInArray(arr, mid + 1, high);
 
        /* compare minimums of two parts*/

        if (mml.min < mmr.min) {
            minMax.min = mml.min;
        } else {
            minMax.min = mmr.min;
        }
 
        /* compare maximums of two parts*/
        
        if (mml.max > mmr.max) {
            minMax.max = mml.max;
        } else {
            minMax.max = mmr.max;
        }
 
        return minMax;

    }

    public static void main(String [] args){

        int arr[]={1,2,3, 555, 8, 10000, 999};
        int arr_size=6;
        Pair minMax=getMinMaxInArray(arr, 0, arr_size-1);
        System.out.println("Minimum number in array is:"+ minMax.min);
        System.out.println("Maximum number in array is:"+ minMax.max);
    }
    
}
