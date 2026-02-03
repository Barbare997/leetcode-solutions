public class StringSolutiona {
    //Jewels and Stones
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i=0; i<stones.length(); i++) {
            if (jewels.contains(Character.toString(stones.charAt(i))))
                result++;
        }
        return result;
    }

    //Count the Number of Consistent Strings
    public int countConsistentStrings(String allowed, String[] words) {
        int cnt=0;
        for (String word : words) {
            if (isConsistent(allowed, word))
                cnt++;
        }
        return cnt;
    }
    public boolean isConsistent (String allowed, String word) {
        for (int i=0; i<word.length(); i++) {
            if (!allowed.contains(Character.toString(word.charAt(i))))
                return false;
        }
        return true;
    }
}
