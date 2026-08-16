class Solution {
    public String reverseWords(String s) {
        // i split the string into individual words, then instead of reversing the character,i traverse the words away from last index to first index and append each word to a string builder finally i return the stringbulder as a string 
        String[]words= s.trim().split ("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i!=0){
            result.append(" ");
            }
        }
        return result.toString();
    }
}