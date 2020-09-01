
public class HeapSort {
  static int count = 0;
  public static void sort(int[] nums) {
    buildHeap(nums);
    for (int i = nums.length - 1; i > 0; i--) {
      Tips.swap(nums, 0, i);
      heapfiy(nums, 0, i);
    }
    System.out.println(count);
  }

  public static void buildHeap(int[] nums) {
    for (int i = nums.length/2 - 1 ; i >= 0; i--) {
      heapfiy(nums, i, nums.length);
    }
  }

  // maxは対象とする配列の長さ
  // idxはroot
  public static void heapfiy(int[] nums, int idx, int max) {
    int largest = idx; // 左右の子ノードよりも大きいと仮定する
    int left = 2 * idx + 1;
    int right = 2 * idx + 2;

    // 仮定の確認
    // 左のほうが親よりも大きい場合は入れ替える
    if (left < max && nums[left] > nums[idx]) {
      largest = left;
    }

    if (right < max && nums[right] > nums[largest]) {
      largest = right;
    }
    // largestがrootじゃない
    if (largest != idx) {
      Tips.swap(nums, idx, largest);
      heapfiy(nums, largest, max);
    }
    count++;
  }
}
