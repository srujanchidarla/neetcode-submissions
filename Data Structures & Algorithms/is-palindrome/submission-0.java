class Solution {
    public boolean isPalindrome(String s) {
        String reverse = "";
        String real = "";
        for(int j=0; j<s.length(); j++){
            if (Character.isLetterOrDigit(s.charAt(j))) {
                real = real + s.charAt((j));
            }
        }
        for(int i=s.length()-1; i>=0;i--){
            if (Character.isLetterOrDigit(s.charAt(i))){
            reverse = reverse + s.charAt(i);
            }
        }

        System.out.println(real);
        System.out.println(reverse);
        if(real.compareToIgnoreCase(reverse) == 0){
            return true;
        }
        return false;
        
    }
}
