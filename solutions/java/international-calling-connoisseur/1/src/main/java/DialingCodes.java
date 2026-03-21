import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    Map<Integer,String> map=new HashMap<>();
    Map<String,Integer> reverse=new HashMap<>();
    

    public Map<Integer, String> getCodes() {
        return this.map;
    }

    public void setDialingCode(Integer code, String country) {
        this.map.put(code,country);
        this.reverse.put(country,code);
        return;
    }

    public String getCountry(Integer code) {
        return this.map.get(code);
    }

    public Integer getCode(String country) {
        return this.reverse.get(country);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(this.map.containsKey(code))
            return;
        else if (this.reverse.containsKey(country))
            return;
        else
            setDialingCode(code,country);
        return;
    }

    public Integer findDialingCode(String country) {
        return this.reverse.get(country);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = this.reverse.get(country);
        this.map.remove(oldCode);
        setDialingCode(code,country);
    }
}
