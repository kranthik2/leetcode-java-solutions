/***
* Longest substring without repeating characters
*/
import java.util.HashSet;

public class LongestSubString{
  public int solution(String s){
    int left=0, right=0;
    int max = 0;
    HashSet<Character> set = new HashSet<>();
    while(right < s.length()){
      if(!set.contains(s.charAt(right)){
        set.add(s.charAt(right));
        right++;
        max = Math.max(set.size(),max);
      }else{
        set.remove(s.charAt(left));
        left++;
      }
    }
    return max;
  }
         
  public static main(String[] args){
    System.out.println(new LongestSubString().solution("abcabcdd"));
  }
}
