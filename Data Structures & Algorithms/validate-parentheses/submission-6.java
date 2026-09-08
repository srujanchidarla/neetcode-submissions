class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
       for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) =='('){
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.isEmpty()){
                return false;
            }

            if(stack.peek() != '{' && s.charAt(i) == '}')
                return false;  
            if(stack.peek() != '[' && s.charAt(i) == ']')
                return false;
            if(stack.peek() != '(' && s.charAt(i) == ')')
                return false;
            
            stack.pop();
            
       }
       int size = stack.size();
       while(!stack.isEmpty()){
        System.out.println(stack.pop());
       }
       if(size == 0){
        return true;
       }
       return false;
    }
}
