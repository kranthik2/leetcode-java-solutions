public class TwoSum{
  private static int[] EMPTY_ARRAY = {};
  
  public int[] solution(int[] nums, int target){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
      int sub = target - nums[i];
      if(map.containsKey(sub)){
        return new int[] {map.get(sub), i};
      }else{
        map.put(nums[i],i);
      }
    }
    return EMPTY_ARRAY;
  }
}
