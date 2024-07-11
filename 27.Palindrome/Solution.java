class Solution {
    public boolean isPalindrome(String s) {
    
    if(s == null){
        return false;
    }

    StringBuilder filteredString = new StringBuilder();

    for(char c : s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
           filteredString.append(Character.toLowerCase(c));
        }
    }
      
      int i = 0 ; int j =filteredString.length()-1;
      while(i<j){
        if(filteredString.charAt(i)!=filteredString.charAt(j)){
            return false;
        }
        i++;
        j--;
      }


        return true;
    }
}