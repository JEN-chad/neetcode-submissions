class Solution {

    
    private boolean isMatch(char start, char end){
        if((start == '(' && end == ')') ||
           (start == '[' && end == ']') ||
           (start == '{' && end == '}')
          ){
            return true;
          }
          return false;
    }


    public boolean isValid(String str) {
        
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                st.push(str.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }

                char ch = st.peek();
                st.pop();

                if(!isMatch(ch, str.charAt(i))){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}