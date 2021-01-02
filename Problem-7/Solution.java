import java.util.Arrays;

public class Solution{

    static void rotate(int arr[])
    {
       int x = arr[arr.length-1], i;
       for (i = arr.length-1; i > 0; i--)
          arr[i] = arr[i-1];
       arr[0] = x;
    }
    
    public static void main(String[] args) 
    {
        int arr[] = new int[]{1, 2, 3, 4, 5, 10, 11, 19};

        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));
        
        rotate(arr);
        
        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
    }
}