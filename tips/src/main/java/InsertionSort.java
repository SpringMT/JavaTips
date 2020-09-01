public class InsertionSort {
  static int count = 0;
  public static void sort(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      insert(nums, i, nums[i]);
    }
    System.out.println(count);
  }

  public static void insert(int[] nums, int pos, int value) {
    int i = pos - 1;
    while (i >= 0 && nums[i] > value) {
      nums[i+1] = nums[i];
      i--;
      count++;
    }
    nums[i+1] = value;
  }
}
