public class MergeSort {
  static public void sort(int[] nums) {
    int[] copy = nums.clone();
    mergeSort(copy, nums, 0, nums.length);
  }

  // resultに最終的に詰める
  static public void mergeSort(int[] nums, int[] result, int start, int end) {
    // 分けきった
    if ((end - start) < 2) {
      return;
    }
    // ここで並び替える
    if ((end - start) == 2) {
      if (result[start] > result[start+1]) {
        Tips.swap(result, start, start +1);
      }
      return;
    }
    // 分割統治
    int mid = (start + end) / 2;
    mergeSort(result, nums, start, mid);
    mergeSort(result, nums, mid, end);
    // mergeする
    int i = start;
    int j = mid;
    int idx = start;
    while(idx < end) {
      if (j >= end || (i < mid && nums[i] < nums[j] )) {
        result[idx] = nums[i];
        i++;
      } else {
        result[idx] = nums[j];
        j++;
      }
      idx++;
    }
  }

}
