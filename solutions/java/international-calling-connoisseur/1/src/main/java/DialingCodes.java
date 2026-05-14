import java.util.Map;
import java.util.*;

public class DialingCodes {

    public Map<Integer, String> codes = new HashMap<>();
    
    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code,country);
    }

    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {      
        if(codes.containsKey(code) == false && codes.containsValue(country) == false){
            codes.put(code,country);
        }
    }

    public Integer findDialingCode(String country) {
        int key = 0;
        for(Map.Entry<Integer, String> entry : codes.entrySet()){
            key = entry.getKey();
        }
        return codes.containsValue(country) == false ? null : key;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(findDialingCode(country) != null){
            codes.remove(findDialingCode(country));
            codes.put(code,country);
        }
    }
}
