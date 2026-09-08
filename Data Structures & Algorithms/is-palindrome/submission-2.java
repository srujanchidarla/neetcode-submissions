class Solution {
    public boolean isPalindrome(String s) {
        // String reverse = "";
        // String real = "";
        // for(int j=0; j<s.length(); j++){
        //     if (Character.isLetterOrDigit(s.charAt(j))) {
        //         real = real + s.charAt((j));
        //     }
        // }
        // for(int i=s.length()-1; i>=0;i--){
        //     if (Character.isLetterOrDigit(s.charAt(i))){
        //     reverse = reverse + s.charAt(i);
        //     }
        // }

        // System.out.println(real);
        // System.out.println(reverse);
        // if(real.compareToIgnoreCase(reverse) == 0){
        //     return true;
        // }
        // return false;

        // String real = "";
        // for(int i=0; i<s.length(); i++){
        //     if(Character.isLetterOrDigit(s.charAt(i))){
        //         real = real + s.charAt(i);
        //     }
        // }

        int i,j;
         for(i=0, j=s.length()-1; i<j; i++, j--){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i)) ){
                i++;
            }
            
            while(j>i && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(i<j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            
            System.out.println(i+" "+j);
         }
         return true;
        
    }
}
