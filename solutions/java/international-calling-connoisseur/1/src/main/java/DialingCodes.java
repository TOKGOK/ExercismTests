import java.util.*;

public class DialingCodes {
    Map<Integer,String> map = new HashMap();
    Map<String,Integer> dialingCodeMap = new HashMap();

    public Map<Integer, String> getCodes() {
        return map;
    }

    public void setDialingCode(Integer code, String country) {
        if(map.containsKey(code)){
            dialingCodeMap.remove(map.get(code));
            map.remove(code);
        }
        if(dialingCodeMap.containsKey(country)){
            map.remove(dialingCodeMap.get(country));
            dialingCodeMap.remove(country);
        }
        
        map.put(code,country);
        dialingCodeMap.put(country,code);
    }

    public String getCountry(Integer code) {
        return map.getOrDefault(code,null);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(dialingCodeMap.containsKey(country) || map.containsKey(code)){
            return;
        }
        
        map.put(code,country);
        dialingCodeMap.put(country,code);
    }

    public Integer findDialingCode(String country) {
        return dialingCodeMap.getOrDefault(country,null);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(dialingCodeMap.containsKey(country) || map.containsKey(code)){
            setDialingCode(code,country);
        }
    }
}
