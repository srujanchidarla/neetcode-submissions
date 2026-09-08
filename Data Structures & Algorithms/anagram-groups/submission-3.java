class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
    
    //    Map<String, List<String>> map = new HashMap<>(); 

    // map.containsKey(string) => true
    // map.get(string).add(string)
    // map.put(string,new ArrayList<>()) 

   Map<String, List<String>> map = new HashMap<>();

           
       for(int i=0; i<strs.length; i++){
        int arr[] = new int[26];
        for(int j=0;j<strs[i].length(); j++){
            arr[strs[i].charAt(j)-'a']++;
           
        }
          String temp = "";
          for(int k=0; k<26; k++){
            temp = temp+ String.valueOf(arr[k]) + " ";
          }
          System.out.println("Temp "+ temp);
          if(!map.containsKey(temp)){
            map.put(temp, new ArrayList<>());
          } 
            map.get(temp).add(strs[i]);
       }
       List<List<String>> result = new ArrayList<>();

       for(Map.Entry<String, List<String>> c : map.entrySet()){
        result.add(c.getValue());
       }
       return result;
    }
}
