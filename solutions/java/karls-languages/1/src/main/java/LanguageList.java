import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> l = new ArrayList<>();

    public boolean isEmpty() {
        if(this.l.size()==0) return true;
        return false;
    }

    public void addLanguage(String language) {
        this.l.add(language);
    }

    public void removeLanguage(String language) {
        this.l.remove(language);
    }

    public String firstLanguage() {
        if(isEmpty()) return null;
        else return this.l.get(0);
    }

    public int count() {
        return this.l.size();
    }

    public boolean containsLanguage(String language) {
        for(String lang: this.l){
            if(lang.equals(language)) return true;
        }
        return false;
    }

    public boolean isExciting() {
        for(String lang: this.l){
            if(lang.equals("Java") || lang.equals("Kotlin") ) return true;
        }
        return false;
    }
}
