/***
* Longest substring without repeating characters
*/
import java.util.HashSet;

/***
* This solution similar to sliding window solution.
* 1) start two pointers from begining of string
* 2) check current character in set, if not dupicate store non duplicate value in set 
* 3) move right pointer to next and compare size of set and max so far, set which ever is max
* 4) if set contains key, you remove duplicate and move left pointer to next character.
* 5) repeat steps 2 to 4 until right pointer reaches end of string
*/
public class LongestSubStringWithoutRepeatingChars{
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
    System.out.println(new LongestSubStringWithoutRepeatingChars().solution("abcabcdd"));
  }
}
