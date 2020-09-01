public class QuickSort {
  static int count = 0;

  public static void sort(int[] nums) {
    quickSort(nums, 0, nums.length - 1);
    System.out.println(count);
  }

  public static void quickSort(int[] nums, int left,  int right) {
    // 再帰の終了条件
    if (left >= right) {
      return;
    }
    int i = partition(nums, left, right);
    quickSort(nums, left, i -1);
    quickSort(nums, i+1, right);
  }

  public static int partition(int[] nums, int left, int right) {
    // 一旦右端をpivotに設定する
    int pivot = nums[right];
    // pivotを決めて pivotのindexをあとできめるが、
    // pivotIndexよりleftは pivotより小さく、rightは大きくなるように移動させる
    // pivotIndexを返して分割する
    int i = left - 1;
    for (int j = left; j < right; j++) {
      if (nums[j] <= pivot) {
        i++;
        Tips.swap(nums, i, j);
        count++;
      }
    }
    Tips.swap(nums, i+1, right);
    count++;
    return i + 1;
  }
}
