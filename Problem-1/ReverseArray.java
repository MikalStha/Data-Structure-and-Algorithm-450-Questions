public class ReverseArray{
    //function that returns the reverse array

    public static void reverseArray(int arr[], int start, int end)
    {
        int temp;

    /*Iterative Approach*/
        
        // while(start<end)
        // {
        //     temp=arr[start];
        //     arr[start]=arr[end];
        //     arr[end]=temp;
        //     start++;
        //     end--;
        // }

    /*Recursive Approach*/

        if(start >= end)
        return;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArray(arr, start+1, end-1);
    }

    public static void printArray(int arr[], int size)
    {
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }

    public static void main(String args[])
    {
        int[] arr={1,2,3,4,5,6};
        printArray(arr, 6);
        reverseArray(arr, 0, 5);
        System.out.println("Reverse Array is: \n");
        printArray(arr, 6);
        
    }
}