class Solution {
    public boolean isAnagram(String s, String t) {
        // s.length()
        // s.charAt(index)
        // ar[s.charAt(index)-'a']
       if(s.length() != t.length()){
          return false;
       }
    //    abacc  baacb
       int arr1[] = new int[26];
       int arr2[] = new int[26];
       for(int i=0; i<s.length(); i++){
          arr1[s.charAt(i)-'a']++; 
          arr2[t.charAt(i)-'a']++; 

          
          // arr[0] = arr[0] + 1
          // arr[0] = 0 + 1 = 1
          //aarr[0] = 1


        //   arr[1] = arr[1]+1 => arr[1] = 0+1 = 1
        // arr[0] = arr[0] + 1 => 1+1 = 2
        // arr[2] = arr[2] +1  => 0+1 =1 
        // arr[2] = arr[2] +1 => 1+1 = 2
        }

        
     for(int i=0; i<26; i++){
        if(arr1[i] != arr2[i]){
            return false;
          }
          
     }
     return true;
    }
}
