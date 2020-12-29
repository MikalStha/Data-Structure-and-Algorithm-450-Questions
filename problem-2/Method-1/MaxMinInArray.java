public class MaxMinInArray {
    
    /* Using Linear Seearch Method*/ 

    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax(int arr[], int n){

        Pair minMax=new Pair();
        int i;

        /*If there is only one element in array then return it as a both min and max */

        if(n==1){
            minMax.min=arr[0];
            minMax.max=arr[0];
            return minMax;
        }

        /* If there are more than one elements than initialize max and min */

        if(arr[0]> arr[1]){
            minMax.min=arr[1];
            minMax.max=arr[0];
        }
        else{
            minMax.min=arr[0];
            minMax.max=arr[1];
        }

        for(i=2; i<n; i++){

            if(arr[i]> minMax.max){
                minMax.max=arr[i];
            }
            else if(arr[i]<minMax.min){
                minMax.min=arr[i];
            }
        }
        return minMax;

    }

    public static void main(String [] args){

        int arr[]={1, 500, 400, 3, 1000, 11};
        int arr_size=6;

        Pair minMax=getMinMax(arr, arr_size);
        System.out.println("Minimum number in arrray is:"+ minMax.min);
        System.out.println("Maximum number in array is:"+ minMax.max);

    }
}
