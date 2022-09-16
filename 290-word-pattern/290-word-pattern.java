class Solution {
    public boolean wordPattern(String pattern, String s) {
    HashMap<Character,String> map=new HashMap<>();
       String word[]=s.split(" ");
          if(pattern.length()!=word.length)
        return false;
    
        for (int i=0;i<pattern.length();i++){
           
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word[i])){
                    return false;
                }
            }  else {
                    if(map.containsValue(word[i])){
                        return false;
                    } 
                    map.put(ch,word[i]);
                     
                
            }
            
        }
        return true;
    }
}