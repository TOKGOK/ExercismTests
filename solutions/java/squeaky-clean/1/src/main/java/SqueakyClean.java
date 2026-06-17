import java.util.*;

class SqueakyClean {
    
    static String clean(String identifier) {
        Map<Character,Character> map = new HashMap();
        map.put(' ','_');
        map.put('4','a');
        map.put('3','e');
        map.put('0','o');
        map.put('1','l');
        map.put('7','t');
        boolean flag = false;

        
        StringBuilder sb = new StringBuilder();
        for(char ch : identifier.toCharArray()){
            if(ch >= '0' && ch <= '9'
              || ch >= 'a' && ch <= 'z'
              || ch >= 'A' && ch <= 'Z'
              || ch == ' '){
                if(flag && ch >= 'a' && ch <= 'z'){
                    sb.append((char)(ch - 0x20));
                }else{
                    sb.append(map.getOrDefault(ch,ch));
                }
                flag = false;
              }else if(ch == '-'){
                flag = true;
              }
            
        }
        return sb.toString();
    }
}
