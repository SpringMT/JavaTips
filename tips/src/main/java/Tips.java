public class Tips {
  public static void reverse(int[] nums, int start) {
    int i = start, j = nums.length - 1;
    while(i < j) {
      swap(nums, i, j);
      i++;
      j--;
    }
  }

  public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
