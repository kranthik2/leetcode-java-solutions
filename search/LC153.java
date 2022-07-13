public class LC153{
    private static  int findMin(int[] nums) {
      int left = 0, right = nums.length-1;
      while(left < right){
        int mid = (right + left) / 2;
        if(nums[mid] < nums[right]){
          right = mid;
        }else{
          left = mid + 1;
        }
      }
      return nums[left];
    }
  
  
  public static void main(String[] args){
      int[] nums = {11,13,15,17};
      System.out.println(findMind(nums));
  }
     
}
