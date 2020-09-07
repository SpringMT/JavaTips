import java.util.ArrayList;
import java.util.List;

// バケツを配列分用意するかで異なりそう
public class BucketSort {
  static public int[] sort(int[] nums) {
    int m = nums.length;
    int max = findMax(nums) + 1;
    int[] bucket = new int[max];
    for (int i = 0; i < m ; i++) {
      bucket[nums[i]] = 1;
    }
    List<Integer> res = new ArrayList<>();
    for (int j = 0; j < max; j++) {
      if (bucket[j] == 1) {
        res.add(j);
      }

    }
    return res.stream().mapToInt(Integer::intValue).toArray();
  }

  static public int findMax(int[] nums) {
    int max = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (max < nums[i]) {
        max = nums[i];
      }
    }
    return max;
  }
}
