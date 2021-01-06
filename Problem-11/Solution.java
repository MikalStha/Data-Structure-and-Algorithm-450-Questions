
public class Solution{

    //Find the duplicate number

    public static int findDuplicate(int[] nums) {
        int slow = nums[0], fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        System.out.println(slow);
        return slow;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 3};
        findDuplicate(arr);

    }
}