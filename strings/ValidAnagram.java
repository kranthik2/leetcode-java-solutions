public class ValidAnagram{

    public boolean isAnagram(String s, String t){
        if(s == null || t == null || s.length() != t.length()){
            return false;
        }
        char[] letters = new char[128];
        for(char c : s.toCharArray()){
            letters[c]++;
        }
        for(char c : t.toCharArray()){
            letters[c]--;
        }

        for(int i=0; i<letters.length; i++){
            if(letters[i] > 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(new ValidAnagram().isAnagram("anagram","nagaram"));
    }

}