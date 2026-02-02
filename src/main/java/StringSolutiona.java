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
}
