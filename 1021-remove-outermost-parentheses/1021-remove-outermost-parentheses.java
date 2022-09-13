class Solution {
    public String removeOuterParentheses(String s) {
        int start=0;
        int open=0;
        int close=0;
      StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '(' ){
                open++;
            }
           else if(s.charAt(i)== ')' ){
                close++;
            }
            if(open==close){
                sb.append(s.substring(start+1,i));
                    start=i+1;
            }
            
        }
        return sb.toString();
    }
}