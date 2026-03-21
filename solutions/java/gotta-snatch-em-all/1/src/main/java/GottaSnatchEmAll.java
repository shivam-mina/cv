import java.util.List;
import java.util.Set;
import java.util.HashSet;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        Set<String> collection = new HashSet<>();
        for( String card: cards){
            collection.add(card);
        }
        return collection;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        Set<String> myDistinct=new HashSet<>(myCollection);
        myDistinct.removeAll(theirCollection);
        Set<String> theirDistinct=new HashSet<>(theirCollection);
        theirDistinct.removeAll(myCollection);

        return !myDistinct.isEmpty() && !theirDistinct.isEmpty();
        
    }

    static Set<String> commonCards(List<Set<String>> collections) {
         Set<String> all=allCards(collections);
        Set<String> common=new HashSet<>();
        for(String card: all){
             boolean contain=true;
                for(Set<String> collection : collections){
                    contain=contain && collection.contains(card);
                }
              if(contain)
                  common.add(card);
            }
        return common;  
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> common=new HashSet<>();
        for(Set<String> collection: collections)
            {
                for(String card: collection){
                    common.add(card);
                }
            }
        return common;
    }
}
